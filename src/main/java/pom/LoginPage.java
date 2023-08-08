package pom;

import org.openqa.selenium.WebDriver;


import pojo.LaunchBrowser;






public class LoginPage {
	
		
		WebDriver driver;
		
		public void openBrowser() {
		driver= LaunchBrowser.chrome("https://www.facebook.com/");
		
		}
		
		
		
		public void loginWithValidCredentials() {
			FacebbookLaunch faceBookLoginPage = new FacebbookLaunch(driver);
			faceBookLoginPage.enterEmail("Arise@gmail.com");
			faceBookLoginPage.enterPassword("12345");
			faceBookLoginPage.clickonLogIn();
			
		}
		public void loginWithValidUserNameAndInvalidPassword() {
			FacebbookLaunch faceBookLoginPage = new FacebbookLaunch(driver);
			faceBookLoginPage.enterEmail("Arise@gmail.com");
			faceBookLoginPage.enterPassword("11111");
			faceBookLoginPage.clickonLogIn();
			
		}
	 
		
		public void loginWithValidUserNameAndPassword() {
			FacebbookLaunch faceBookLoginPage = new FacebbookLaunch(driver);
			faceBookLoginPage.enterEmail("Arise@gmail.com");
			faceBookLoginPage.enterPassword("11111");
			faceBookLoginPage.clickonLogIn();
			
		}


	}






