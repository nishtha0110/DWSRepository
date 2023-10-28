package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

   public LoginPage(WebDriver driver) {
	   PageFactory.initElements(driver,this);
   }
   @FindBy (id ="Email")
   private WebElement emailTextField;
   
   public void emailText(String email) {
	   emailTextField.sendKeys(email);
   }
   @FindBy (id = "Password")
   private WebElement passwordTextField;
   
   public void passwordText(String password) {
	   passwordTextField.sendKeys(password);
   } 
   @FindBy (xpath = "//input[@value='Log in']")
   WebElement loginButton;
   
   public void clickLoginButton() {
	   loginButton.click();  
   }
   
   @FindBy (id="RememberMe")
   WebElement rememberMe;
   
   public void checkRememberMe() {
	rememberMe.click();
   }   
   @FindBy (xpath="//a[text()='Forgot password?']")
   WebElement forgotPassword;
   
   public void clickForgotPassword() {
	   forgotPassword.click();
   }
   @FindBy (xpath="//input[@value='Register']")
   WebElement loginRegisterButton;
   
   public void clickLoginRegisterButton() {
	   loginRegisterButton.click(); 
   }
}
