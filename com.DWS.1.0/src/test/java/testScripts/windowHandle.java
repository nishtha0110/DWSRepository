package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

public class windowHandle extends BaseTest{
	
	@Test
	public void windowHandle() {
		
	
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
	
	
		
		
	}

}
