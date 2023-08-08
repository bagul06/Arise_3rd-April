package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.LaunchBrowser;


public class Parametrization {
	
	public String getExcelData(int row,int cell,String sheetname)throws EncryptedDocumentException, IOException {
		

		FileInputStream file = new FileInputStream("\"C:\\Users\\shita\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx\"");
		
		String value =WorkbookFactory.create(file).getSheet("Credentials").getRow(0).getCell(0).getStringCellValue();
		
		return value;
		
		}
		
		public static void main(String[] args) {
			
			
			WebDriver driver = LaunchBrowser.chrome("http.//www.facebook.com");
			
		    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			
		    WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
			
		    email.sendKeys();
			pass.sendKeys();
			
		}
	


}
