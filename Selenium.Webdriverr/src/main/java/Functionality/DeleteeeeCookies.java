package Functionality;

//import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DeleteeeeCookies {
	@Test
	public void script1() throws BiffException, IOException   {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Alert.html");	
	
	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	String msg=d1.switchTo().alert().getText();
	d1.switchTo().alert().accept();
	System.out.println(msg);
	

    
    //File f1=new File("C:\\Users\\latha\\OneDrive\\Desktop\\Cookies\\Cookies.data");
    String URL="http://flipkart.com/";
	d1.navigate().to(URL);
	d1.manage().deleteCookieNamed("__utmb");

}
}
