package Functionality;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Download {
	
	
	@Test
	public void script1()throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/download.html");
	
	WebElement download = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]"));
	download.click();

	File file = new File ("C:\\Users\\latha\\OneDrive\\Documents\\testleaf.xls");
	File[]  Totalfiles = file.listFiles();

	for (File Filename : Totalfiles) {

	if(Filename.getName().equals("Teastleaf.xlsx"));
	}
	{
	System.out.println("file is downloaded");

}

	}
}