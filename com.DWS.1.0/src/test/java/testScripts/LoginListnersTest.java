package testScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ReadExcel;
import pomRepo.BooksPage;
import pomRepo.LoginPage;
import pomRepo.WelcomePage;

@Listeners(genericLibrary.ListenersImplementation.class)

public class LoginListnersTest extends BaseTest{
	  
	   @Test (dataProvider  ="loginData")
	   public void loginTest(String email,String password) {
	   
	   WelcomePage welcomePage=new WelcomePage(driver);
   //   welcomePage.loginLink.click();
	   welcomePage.clickLoginLink();
	    
	   LoginPage loginPage=new LoginPage(driver);
	   loginPage.emailText(email);
	   loginPage.passwordText(password);
   //   loginPage.emailTextField.sendKeys(email);
   //   loginPage.passwordTextField.sendKeys(password);
	   
	   
//	   driver.findElement(By.xpath("//a[text()='Log in']")).click();
//	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
//	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
//	   Assert.assertTrue(false);
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();	   
	   
	   }
	   @DataProvider (name="loginData")
	   public Object[][] loginData() throws EncryptedDocumentException, IOException{
		   return ReadExcel.multiplereadsdata("Login");
	   }
	}  


