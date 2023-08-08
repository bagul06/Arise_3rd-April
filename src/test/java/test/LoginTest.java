package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;




public class LoginTest {
	WebDriver driver;
	
			@BeforeMethod
			public void openBrowser() {
			driver = LaunchBrowser.chrome("https://www.facebook.com/");
			}
			
			
			@Test
			public void loginWithValidCredentials() {
				FacebookBase faceBookLoginPage = new FacebookBase(driver);
				faceBookLoginPage.enterEmail("Arise@gmail.com");
				faceBookLoginPage.enterPassword("12345");
				faceBookLoginPage.clickonLogIn();
				
			}
			
			@Test
			public void loginWithValidUserNameAndInvalidPassword() {
				FacebookBase faceBookLoginPage = new FacebookBase(driver);
				faceBookLoginPage.enterEmail("Arise@gmail.com");
				faceBookLoginPage.enterPassword("11111");
				faceBookLoginPage.clickonLogIn();
				
			}
		 
			@Test
			public void loginWithValidUserNameAndPassword() {
				FacebookBase faceBookLoginPage = new FacebookBase(driver);
				faceBookLoginPage.enterEmail("Arise@gmail.com");
				faceBookLoginPage.enterPassword("11111");
				faceBookLoginPage.clickonLogIn();
				}

            @AfterMethod
            public void closeBrowser() {
            	driver.close();
            }
		}








