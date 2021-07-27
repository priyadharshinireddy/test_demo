package Functionality;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Elements.Login_Pageobject;

public class Login {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(d1, Login_Pageobject.class);
		Login_Pageobject.Username.sendKeys("Admin");
		Login_Pageobject.password.sendKeys("admin123");
		Login_Pageobject.button.click();

	

	    
	}

}
