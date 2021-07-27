package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebElementDoubleclick {
	

	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		//Implicit
	    d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d1.get("http://www.leafground.com/pages/Edit.html");
	    
	    WebElement ele1 = d1.findElement(By.id("email"));
	    
	    Actions act1=new Actions(d1);
	    act1.sendKeys(ele1,"priya")
	    .doubleClick(ele1).build().perform();

}

}



