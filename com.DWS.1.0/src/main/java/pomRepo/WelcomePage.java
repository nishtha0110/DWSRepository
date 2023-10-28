package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    
	//We need a constructor of the class as when we create object of this class this constructor will be called and inside constructor driver instance is made global to access at current testcases/pointing to current page.
	public WelcomePage(WebDriver driver){
		//init elements is used to initialize the variable while using pom ,without it while running even if all the things are correct it will throw null pointer exception
		PageFactory.initElements(driver, this);	
	}
    @FindBy(partialLinkText = "Log in")
    private WebElement loginLink;
   
    //business logic or action ,so that we directly dont perform action or initialize any variable
    public void clickLoginLink() {
       loginLink.click();
    } 
    //After Declaring any element as private the manager/tl will provide getter setter sometime so that any imp element cant be fetched by others easily
	public WebElement getLoginLink() {
		return loginLink;
	}
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}
    //All the Elements of Welcome page in this WelcomePage are listed below
    @FindBy (xpath="//a[text()='Register']")
    WebElement registerLink;
    
    public void clickRegisterLink() {
    	registerLink.click();
    }
    @FindBy (xpath="//span[text()='Shopping cart']") 
    WebElement shoppingCart;
    
    public void clickShoppingCart() {
    	shoppingCart.click();
    }
    @FindBy (xpath="//span[text()='Wishlist']")
    WebElement wishList;
    
    public void clickWishList() {
    	wishList.click();	
    }
    @FindBy (id="small-searchterms")
    WebElement searchTextField;
    
    public void InputSearchTF(String product) {
    	searchTextField.sendKeys(product);
    }
    @FindBy (className ="button-1 search-box-button")
    WebElement searchButton;
    
    public void clickSearchButton () {
    	searchButton.click(); 	
    }
    @FindBy (xpath="(//ul[@class='top-menu']/descendant::a)[1]")
    WebElement headerBooks;
    
    public void clickHeaderBooksLink() {
    	headerBooks.click();
    }
    @FindBy (xpath="(//ul[@class='top-menu']/descendant::a)[2]")
    WebElement headerComputers;
    
    public void clickHeaderComputersLink() {
    	headerComputers.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Desktops')])[1]")
    WebElement headerDesktops;
    
    public void clickHeaderDesktops() {
    	headerDesktops.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Notebooks')])[1]")
    WebElement headerNotebooks;
    
    public void clickHeaderNotebooks() {
    	headerNotebooks.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Accessories')])[1]")
    WebElement headerAccessories;
    
    public void clickHeaderAccessories() {
    	headerAccessories.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Electronics')])[1]")
    WebElement headerElectronics;
    
    public void clickHeaderElectronics() {
    	headerElectronics.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Camera, photo')])[1]")
    WebElement headerCameraPhoto;
    
    public void clickHeaderCameraPhone() {
    	
      headerCameraPhoto.click();
    }
    @FindBy(xpath="(//a[contains(text(),'Cell phones')])[1]")
    WebElement headerCellPhones;
    
    public void clickHeaderCellPhones() {
    	headerCellPhones.click();
    }
    @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
    WebElement headerApparelShoes;
    
    public void clickHeaderApparelShoes() {
    	headerApparelShoes.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Digital downloads')])[1]")
    WebElement headerDigitalDownloads;
    
    public void clickHeaderDigitalDownloads() {
    	headerDigitalDownloads.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Jewelry')])[1]")
    WebElement headerJewelry;
    
    public void clickHeaderJewelry() {
    	headerJewelry.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Gift Cards')])[1]")
    WebElement headerGiftsCards;
    
    public void headerGiftsCards() {
    	headerGiftsCards.click();
    }
    //Categories List Elements in Welcome page
    @FindBy (xpath="(//a[contains(text(),'Books')])[3]")
    WebElement categoriesBooks;
    
    public void clickcategoriesBooks() {
       categoriesBooks.click();
    }
    @FindBy(xpath="(//a[contains(text(),'Computers')])[3]")
    WebElement categoriesComputers;
    
    public void clickCategoriesComputers() {
    	categoriesComputers.click();	
    }
    @FindBy (xpath="(//a[contains(text(),'Desktops')])[3]")
    WebElement categoriesDesktops;
    
    public void clickCategoriesDesktops() {
    	categoriesDesktops.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Notebooks')])[3]")
    WebElement categoriesNotebooks;
    
    public void clickcategoriesNotebooks() {
    	 categoriesNotebooks.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Accessories')])[3]")
    WebElement categoriesAccessories;
    
    public void clickCategoriesAccessories() {
    	categoriesAccessories.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Electronics')])[3]")
    WebElement categoriesElectronics;
    
    public void clickCategoriesElectronics() {
    	categoriesElectronics.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Apparel & Shoes')])[3]")
    WebElement categoriesApparelAndShoes;
    
    public void clickCategoriesApparelAndShoes() {
    	categoriesApparelAndShoes.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Digital downloads')])[3]")
    WebElement categoriesDigitalDownloads;
    
    public void clickCategoriesDigitalDownloads() {
    	categoriesDigitalDownloads.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Jewelry')])[3]")
    WebElement categoriesJewelry;
    
    public void clickCategoriesJewelry() {
    	categoriesJewelry.click();
    }
    @FindBy (xpath="(//a[contains(text(),'Gift Cards')])[3]")
    WebElement categoriesGiftCards;
    
    public void clickCategoriesGiftCards() {
    	categoriesGiftCards.click();
    }
    @FindBy (xpath="//a[contains(text(),'Tricentis')]")
    WebElement categoriesTricentis;
    
    public void clickCategoriesTricentis() {
    	categoriesTricentis.click();  	
    }
     @FindBy (id="newsletter-email")
     WebElement newsLetterEmail;
     
     public void inputNewsLetter(String email) {
    	 newsLetterEmail.sendKeys(email);
     }
     @FindBy (id="newsletter-subscribe-button")
     WebElement newsLetterSubscribe;
     
     public void clickNewsLetterSubscribe() {
    	 newsLetterSubscribe.click();
     }
     @FindBy (xpath="//a[contains(text(),'apparel')]")
     WebElement popularTagsApparel;
     
     public void clickPopularTagsApparel() {
    	 popularTagsApparel.click();
     }
     @FindBy (xpath="//a[contains(text(),'awesome')]")
     WebElement popularTagsAwesome;
     
     public void clickPopularTagsAwesome() {
    	 popularTagsAwesome.click();
     }
     @FindBy (xpath="(//a[contains(text(),'book')])[3]")
     WebElement popularTagsBook;
     
     public void clickPopularTagsBook() {
    	 popularTagsBook.click();
     }
     @FindBy (xpath="(//a[contains(text(),'camera')])[1]")
     WebElement popularTagsCamera;
     
     public void clickPopularTagsCamera() {
    	 popularTagsCamera.click();
     }
     @FindBy (xpath="(//a[contains(text(),'cell')])[1]")
     WebElement popularTagsCell;
     
     public void clickPopularTagsCell() {
    	 popularTagsCell.click();
     }
     @FindBy (xpath="(//a[contains(text(),'compact')])[1]")
     WebElement popularTagsCompact;
     
     public void clickPopularTagsCompact() {
    	 popularTagsCompact.click();
     }
     @FindBy (xpath="(//a[contains(text(),'computer')])[1]")
     WebElement popularTagsComputer;
     
     public void clickPopularTagsComputer() {
    	 popularTagsComputer.click();
     }
     @FindBy (xpath="(//a[contains(text(),'cool')])[1]")
     WebElement popularTagsCool;
     
     public void clickPopularTagsCool() {
    	 popularTagsCool.click();
     }
     @FindBy (xpath="(//a[contains(text(),'digital')])[1]")
     WebElement popularTagsDigital;
     
     public void clickPopularTagsDigital() {
    	 popularTagsDigital.click();
     }
     @FindBy (xpath="(//a[contains(text(),'gift')])[1]")
     WebElement popularTagsGift;
     
     public void clickPopularTagsGift() {
    	 popularTagsGift.click();
     }
    @FindBy (xpath="(//a[contains(text(),'jewelry')])[1]")
    WebElement popularTagsJewelry;
    
    public void clickPopularTagsJewelry() {
    	popularTagsJewelry.click();
    }
    @FindBy (xpath="//a[contains(text(),'nice')]")
    WebElement popularTagsNice;
    
    public void popularTagsNice() {
    	popularTagsNice.click();
    }
    @FindBy (xpath="//a[contains(text(),'shirt')]")
    WebElement popularTagsShirt;
    
    public void popularTagsShirt() {
    	popularTagsShirt.click();
    }
    @FindBy (xpath="//a[contains(text(),'shoes')]")
    WebElement popularTagsShoes;
    
    public void popularTagsShoes() {
    	popularTagsShoes.click();
    }
    @FindBy (xpath="//a[contains(text(),'TCP')]")
    WebElement popularTagsTCP;
    
    public void popularTagsTCP() {
    	popularTagsTCP.click();
    }
    @FindBy (xpath="//a[contains(text(),'View all')]")
    WebElement popularTagsViewAll;
    
    public void popularTagsViewAll() {
    	popularTagsViewAll.click();
    }
    @FindBy (xpath="//li[@class='last']/descendant::a[@class='product-name']")
    WebElement recentlyViewedProduct;
    
    public void recentlyViewedList() {
    	recentlyViewedProduct.click();
    }
    @FindBy (id="pollanswers-1")
    WebElement communityPollExcellent;
    
    public void enablePollExcellent() {
    	communityPollExcellent.click();
    }
    @FindBy (id="pollanswers-2")
    WebElement communityPollGood;
    
    public void enablePollGood() {
    	communityPollGood.click();
    }
    @FindBy (id="pollanswers-3")
    WebElement communityPollPoor;
    
    public void enablePollPoor() {
    	communityPollPoor.click();
    }
    @FindBy (id="pollanswers-3")
    WebElement communityPollVeryBad;
    
    public void enablePollVeryBad() {
    	communityPollVeryBad.click();
    }
    @FindBy (id="vote-poll-1")
    WebElement communityPollVote;
    
    public void clickVoteButton() {
    	communityPollVote.click();
    }
    @FindBy (xpath="//a[text()='Prev']")
    WebElement previousArrow;
    
    public void clickPrevArrow() {
    	previousArrow.click();
    }
    @FindBy (xpath="//a[text()='Next']")
    WebElement nextArrow;
    
    public void clickNextArrow() {
    	nextArrow.click();
    }
    @FindBy (xpath="//a[text()='$25 Virtual Gift Card']")
    WebElement virtualGiftCard;
    
    public void clickVirtualGift() {
    	virtualGiftCard.click();
    }
    @FindBy (xpath="//a[text()='14.1-inch Laptop']")
    WebElement inchLaptop;
    
    public void clickInchLaptop() {
    	inchLaptop.click();
    }
    @FindBy (xpath="//a[text()='Build your own cheap computer']")
    WebElement buildCheapComp;
    
    public void clickBuildCheapComp() {
    	buildCheapComp.click();
    }
    @FindBy (xpath="//a[text()='Build your own computer']")
    WebElement buildOwnComp;
    
    public void clickBuildOwnComp() {
    	buildOwnComp.click();
    }
    @FindBy (xpath="//a[text()='Build your own expensive computer']")
    WebElement buildOwnExpComp;
    
    public void clickBuildOwnExpComp() {
    	buildOwnExpComp.click();
    }
    @FindBy (xpath="//a[text()='Simple Computer']")
    WebElement buildSimpleComp;
    
    public void clickBuildSimpleComp() {
    	buildSimpleComp.click();
    }
    @FindBy (xpath="(//input[@value='Add to cart'])[1]")
    WebElement addToCart1;
    
    public void clickAddToCart1() {
    	addToCart1.click();
    }
    @FindBy (xpath="(//input[@value='Add to cart'])[2]")
    WebElement addToCart2;
        
    public void clickAddToCart2() {
       addToCart2.click();
    }
    @FindBy (xpath="(//input[@value='Add to cart'])[3]")
    WebElement addToCart3;
        
    public void clickAddToCart3() {
       addToCart3.click();
    }
    @FindBy (xpath="(//input[@value='Add to cart'])[4]")
    WebElement addToCart4;
        
    public void clickAddToCart4() {
       addToCart4.click();
    }
    @FindBy (xpath="(//input[@value='Add to cart'])[5]")
    WebElement addToCart5;
        
    public void clickAddToCart5() {
       addToCart5.click();
    }
    @FindBy (xpath="(//input[@value='Add to cart'])[6]")
    WebElement addToCart6;
        
    public void clickAddToCart6() {
       addToCart6.click();
    }
       
}
