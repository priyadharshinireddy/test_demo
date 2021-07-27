package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
	
	@Test
public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Button.html");
		d1.findElement(By.id("home"));
	    d1.findElement(By.id("position"));
	    d1.findElement(By.id("color"));
	    d1.findElement(By.id("size")).click();
		d1.quit();


}
}