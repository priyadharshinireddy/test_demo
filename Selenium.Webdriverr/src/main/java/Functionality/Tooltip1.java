package Functionality;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip1 {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();

		d1.get(("http://www.leafground.com/pages/tooltip.html"));	 
	 System.out.println("page Displayed"); 
	 
	 d1.manage().window().maximize(); 
	 
	 Actions actions = new Actions(d1); 
	 
		WebElement el1 = d1.findElement(By.id("age"));
	 
	 actions.moveToElement(el1).perform(); 
	 
	 WebElement toolTip = d1.findElement(By.cssSelector("#age")); 
	 
	 String toolTipText = toolTip.getText();
	 System.out.println("toolTipText-->"+toolTipText); 
	 
	 if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){ 
	 System.out.println("Pass* : Tooltip matching expected value");
	 }else{
	 System.out.println("Fail : Tooltip NOT matching expected value"); 
	 } 
	 
	 d1.close();
	 } 

}
