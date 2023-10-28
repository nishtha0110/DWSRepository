package testScripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ReadExcel;

	@Listeners(genericLibrary.ListenersImplementation.class)
	public class AddtocartListnersTest extends BaseTest{

		@Test (dataProvider ="addToCart")
		public void addToCart(String email,String password) {
				driver.findElement(By.xpath("//a[text()='Log in']")).click();
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
				driver.findElement(By.xpath("//input[@value='Log in']")).click();	
			}
		@DataProvider (name="addToCart")
		public Object[][] registerData() throws EncryptedDocumentException, IOException{
				return ReadExcel.multiplereadsdata("Addtocart");
			}
		 
		@Test
		public void restscript() {
		WebElement cheapcomputer=driver.findElement(By.xpath("//a[text()='Build your own cheap computer']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",cheapcomputer);
		WebElement addtocart=driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]"));
		js.executeScript("arguments[0].click();",addtocart);

		WebElement cheapcomputercart=driver.findElement(By.id("add-to-cart-button-72"));
		js.executeScript("arguments[0].scrollIntoView(true);",cheapcomputercart);
		js.executeScript("arguments[0].click();",cheapcomputercart);

		WebElement shoppingcart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		js.executeScript("arguments[0].scrollIntoView(true);",shoppingcart);
		shoppingcart.click();
	//	Assert.assertTrue(false);

		WebElement cartVerification=driver.findElement(By.xpath("(//a[text()='Build your own cheap computer'])[2]"));
		String cartitem=cartVerification.getText();
		System.out.println(cartitem);
		}
	}

