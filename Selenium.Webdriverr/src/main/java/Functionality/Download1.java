package Functionality;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Download1 {
	
	@Test
	public void script1()throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/download.html");
	driver.findElement(By.linkText("Download Excel")).click();
	
	File f1 = new File("C:\\Users\\latha\\Downloads");
	File[] var_files = f1.listFiles();
	
	for(File type_file : var_files) {
		
		if(type_file.getName().equalsIgnoreCase("testleaft.xls"));
		System.out.println("File Exist");
		break;
		
		
	}

}
}
