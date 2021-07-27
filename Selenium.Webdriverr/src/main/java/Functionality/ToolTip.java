package Functionality;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get(("http://www.leafground.com/pages/tooltip.html"));
		
		WebElement el1 = d1.findElement(By.id("age"));
		
		String msz=el1.getAttribute("title");
		System.out.println(msz);
		
		
	}
	
	
}
