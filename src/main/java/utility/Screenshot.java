package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shita\\OneDrive\\Documents\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher/tech/practice/practice-dropdowns-selenium-webdriver");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("\"C:\\Users\\shita\\OneDrive\\Documents\\Screenshots\\dropdown");
		
		FileHandler.copy(source, destination);
		
		
}

}
