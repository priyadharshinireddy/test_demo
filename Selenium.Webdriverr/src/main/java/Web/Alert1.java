package Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert1 {
	
	  @Test
	    public void script1() {

	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    	WebDriver d1;
	    	d1=new ChromeDriver();
	    	d1.get("http://www.leafground.com/pages/Alert.html");
	        d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	        Alert alert=d1.switchTo().alert();
	        alert.sendKeys("HI");
	        alert.accept();

	  }
}
