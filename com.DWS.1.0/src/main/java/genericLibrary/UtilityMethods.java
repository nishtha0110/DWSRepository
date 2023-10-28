package genericLibrary;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethods {
	
	public static WebDriver driver;
	public Select select;
	public Actions action;
	public WebDriverWait wait;
	
	//We will initialize object here so that it wont consume any memory by creating objects again in 
	//various testScripts. so when Basetest will run just after opening browser object will be created in this class
	public void initObjects() {
		
		action=new Actions(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}  
	public void selectClass(WebElement dropDownAddress,String methodType,String inputparam) {
		select=new Select(dropDownAddress);
	
		if (methodType.equalsIgnoreCase("VisibleText")) {
			select.selectByVisibleText(inputparam);
		}
		else if(methodType.equalsIgnoreCase("Value")) {
			select.selectByValue(inputparam);
		}
		else if(methodType.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(inputparam));		
}}
	//Alternate way for using Select Class with options
	public void selectOptionDropDown(WebElement listbox,String option) {
		 select=new Select(listbox);
		 int counter=0;
		 
	try {
		int index=Integer.parseInt(option);
		select.selectByIndex(index);
		counter++;
		}
	catch(Exception e) {
		System.out.println("It is not a index");
		}
	
	}
	
	
	
	
	
	
	
	
	//Method with a title so that tab will switch to the Window with given title and be there as break is given afetr which we can perforn other action
	public void switchToTitleWindow(String title) {
		String parentWindowHandle=driver.getWindowHandle();
		Set<String> WindowHandles=driver.getWindowHandles();
		WindowHandles.remove(parentWindowHandle);
		for(String handle:WindowHandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().contains(title)) {
				break;
			}
}}	
	public static void getScreenshot(String testMethodName) {
		 LocalDateTime dateTime=LocalDateTime.now();
		 String timestamp=dateTime.toString();
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File dest=new File("./Screenshot/"+testMethodName+timestamp+".png");
		 File temp=ts.getScreenshotAs(OutputType.FILE);
		 
		 try {
			 FileHandler.copy(temp, dest);
		 }
         catch (Exception e){
        	 e.printStackTrace();
         }	
	}

}
