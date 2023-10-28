package testScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ReadExcel;

@Listeners(genericLibrary.ListenersImplementation.class)
public class RegisterListnersTest extends BaseTest{

	@Test (dataProvider= "registerData")
	public void RegisterTest(String firstName,String lastName,String email,String password,String confirmPassword) {
		
		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement registertext=driver.findElement(By.xpath("//h1[text()='Register']"));
		registertext.isDisplayed();
		
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();
		gender.isEnabled();
	
		
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
	//	Assert.assertTrue(false);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}
    @DataProvider (name="registerData")
    	public Object[][] registerdata() throws EncryptedDocumentException, IOException {
    		return ReadExcel.multiplereadsdata("Register");
    	}
    }
