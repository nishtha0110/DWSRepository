package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath="(//ul[@class='top-menu']/descendant::a)[1]")
	public static WebElement headerBooks;

	public void clickHeaderBooksLink() {
		headerBooks.click();
	}
	@FindBy (id="products-orderby")  
	WebElement booksDropDownProduct;
	
	
	
}
