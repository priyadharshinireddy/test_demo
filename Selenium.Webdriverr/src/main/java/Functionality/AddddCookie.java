package Functionality;

import java.io.File;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class AddddCookie {
	
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
		
	
        
        File f1=new File("C:\\Users\\latha\\OneDrive\\Desktop\\Cookies\\Cookies.data");
        String URL="http://flipkart.com/";
		d1.navigate().to(URL);
               
		Cookie name = new Cookie("mycookie", "123456789123");
		d1.manage().addCookie(name);
		
		Set<Cookie> cookiesList =  d1.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
	}
}
        
   
