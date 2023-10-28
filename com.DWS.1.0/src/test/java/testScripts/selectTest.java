package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepo.BooksPage;

public class selectTest extends BaseTest {
	
	@Test
	public void selectMethods() throws InterruptedException{
	  System.setProperty("Webdriver.Chrome.Driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  
	 // WebElement books=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
	  BooksPage book=new BooksPage(driver);
	  action.moveToElement(book.headerBooks);
	  book.clickHeaderBooksLink();
	  			  
	//clickHeaderBooksLink();
	  
	  	  
	  WebElement dropDownAddress=driver.findElement(By.id("products-orderby"));
	  Thread.sleep(1000);
   //  selectClass(dropDownAddress,"selectByValue","https://demowebshop.tricentis.com/books?orderby=5");
      selectClass(dropDownAddress,"selectByVisibleText","Name: Z to A");
   //  Thread.sleep(1000);
   //   selectClass(dropDownAddress,"selectByIndex","3");	 
	
}}