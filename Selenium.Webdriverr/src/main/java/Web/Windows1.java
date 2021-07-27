package Web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows1 {
	
	@Test
	public void script() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Window.html");
	
	String parent = d1.getWindowHandle();
	WebElement button = d1.findElement(By.id("home"));
	button.click();

	Set<String> windows = d1.getWindowHandles();
	for (String child  : windows) {
	d1.switchTo().window(child);

	}

	WebElement Edit = d1.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
	Thread.sleep(2000);
	Edit.click();
	Thread.sleep(2000);
	d1.close();

	d1.switchTo().window(parent);
	  WebElement count = d1 .findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	  count.click();
	 
	  Set<String> Totalwindows = d1.getWindowHandles();
	  int Total = Totalwindows.size();
	  System.out.println(Total);

	}

}
