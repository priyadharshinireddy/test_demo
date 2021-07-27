package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button1 {

	
	@Test
	public void script1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");

			        WebDriver driver = new ChromeDriver();

			driver.get("http://leafground.com");

			WebElement Button = driver.findElement(By.xpath("//img[@alt='Buttons']"));
			Button.click();

			WebElement Homepage = driver.findElement(By.xpath("//*[@id=\"home\"]"));
			Homepage.click();


			}
}
