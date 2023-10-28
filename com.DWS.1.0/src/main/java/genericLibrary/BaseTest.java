package genericLibrary;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest extends UtilityMethods {
//public static WebDriver driver;//Generally we dont provide static keyword as we cant do parralel execution if static is present with webdriver
	
	@Parameters("browserName")
	@BeforeClass  
	//we provide optional when we donot want to run the xml file of login & register containing program with browserName value passed in xml file itself 
	public void browserSetUp(@Optional("chrome")String browserName) {
		
		if(browserName.contains("chrome")){
			   System.setProperty("Webdriver.Chrome.Driver","./driver/chromedriver.exe");
			  driver=new ChromeDriver();
		
		 }  else if(browserName.contains("firefox")) {
			  System.setProperty("Webdriver.Gecko.Driver","./driver/geckodriver.exe");
		      driver=new FirefoxDriver();
		 }   else {
			   System.out.println("Give Valid Browser Name");
		 }
		    driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			initObjects();
	     }
		
     @AfterClass
	 public void browserTearDown() {
		driver.quit();
		
	}
}
