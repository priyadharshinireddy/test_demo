package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	@Test
	public void script1() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
			d1.get("http://www.leafground.com/pages/Dropdown.html");
			
			Select select1 = new Select(d1.findElement(By.name("dropdown2")));
			select1.selectByVisibleText("UFT/QTP");
			select1.selectByVisibleText("Appium");

				
			Select select2 = new Select(d1.findElement(By.id("dropdown1")));
		    select2.selectByIndex(3);
		 
			
            Select select3 = new Select(d1.findElement(By.name("dropdown3")));
			select3.selectByValue("4");
			
			Select select4 = new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")));
			select4.selectByIndex(2);
			
			Select select5 = new Select(d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")));
			select5.selectByValue("3");
			
			
	}
	}

			
            