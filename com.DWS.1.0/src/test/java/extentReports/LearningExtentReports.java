package extentReports;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	static WebDriver driver;

	public static void main(String[] args) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/testReport.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest test=report.createTest("LoginListnersTest");
		System.setProperty("Webdriver.Chrome.Driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   driver.get("https://demowebshop.tricentis.com/");
	   test.log(Status.INFO,"WebPage is Loaded");
		
	   driver.findElement(By.xpath("//a[text()='Log in']")).click();
	   test.log(Status.INFO,"Login Link is clicked");
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nishtha.1@testyantra.com");
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password0@");
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	   
	   //we can also use if else but then exception like no such elements found will not be handled
	   try {
		      if(driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed());
			  System.out.println("PASS:User is logged in");
		      test.log(Status.PASS,"User has logged in Successfully");
		  }
	  catch(Exception e)
	   {
			 System.out.println("FAIL:User is logged out");
			 test.log(Status.FAIL, "User has not logged in Successfully");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(getScreenShot()).build());
	   }
      driver.quit();
      report.flush();//Mandatory for generating the report as it tells report ended
	}
    /*This method takes screenshot when invoked as well as returns the path of the
     * screenshot in the form of String
     * @return
     */
     public static String getScreenShot() {
    	 LocalDateTime dateTime=LocalDateTime.now();
    	 String DataStamp=dateTime.toString().replaceAll(":","-");
    	 String Path="./Screenshot/"+DataStamp+".png";
    	 TakesScreenshot ts=(TakesScreenshot)driver;
    	 File temp=ts.getScreenshotAs(OutputType.FILE);
    	 File dest=new File(Path);
    	 try {
    		 FileHandler.copy(temp, dest);
    	 }
         catch (Exception e){
        	 e.printStackTrace();
        	 
         }
         return "."+Path;
     
     }

}
