package Functionality;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Elements.DashBoard_PageObject;
import Elements.Login_PageObject;

public class DashBoard {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("https://opensource-demo.orangehrmlive.com/");

		PageFactory.initElements(d1, Login_PageObject.class);
		Login_PageObject.Username.sendKeys("Admin");
		Login_PageObject.password.sendKeys("admin123");
		Login_PageObject.button.click();

		PageFactory.initElements(d1, DashBoard_PageObject.class);
		String text = DashBoard_PageObject.PendingLeaveRequests.getText();
		System.out.println(text);




}
}