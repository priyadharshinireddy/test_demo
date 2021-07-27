package Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame1 {
	
	@Test
	public void script() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/frame.html");
	
	d1.switchTo().frame(0);
	WebElement firstframe = d1.findElement(By.id("Click"));
	firstframe.click();

	d1.switchTo().defaultContent();
	d1.switchTo().frame(1);
	d1.switchTo().frame("frame2");

	WebElement secondframe = d1.findElement(By.id("Click1"));
	secondframe.click();
	d1.switchTo().defaultContent();

	List<WebElement> thirdframe = d1.findElements(By.tagName("iframe"));
	int total = thirdframe.size();
	System.out.println(total);
	
	
}

}
