package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Fluentwait {
	
	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		//Implicit
	    d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	       d1.get("http://www.leafground.com/");
	       
	       d1.findElement(By.linkText("Edit")).click();
	       
	       FluentWait wait = new FluentWait(d1)
	    		   .withTimeout(20, TimeUnit.SECONDS)
	    		   .pollingEvery(5,TimeUnit.SECONDS)
	    		   .ignoring(NosuchElementFoundException.class);
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");
	}

}
