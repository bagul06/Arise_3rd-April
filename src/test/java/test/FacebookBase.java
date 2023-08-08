package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookBase {

	




		@FindBy (xpath = "//input[@id='email']")private WebElement email;
		@FindBy (xpath = "//input[@id='pass']")private WebElement password;
		@FindBy (xpath = "//button[@name='login']")private WebElement LogIn;
		@FindBy (xpath = "//a[text()='Forgotten password?']")private WebElement ForgotPassword;
		@FindBy (xpath = "//a[text()='Create new account']")private WebElement CreateAccount;
		
		public FacebookBase(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void enterEmail(String id) {
			email.sendKeys(id);
		}
		
		public void enterPassword(String pass) {
			password.sendKeys(pass);
		}
		public void clickonLogIn() {
			LogIn.click();
		}

		
		public void clickonCeateAccount() {
			CreateAccount.click();
		}

			
			
		}
			



