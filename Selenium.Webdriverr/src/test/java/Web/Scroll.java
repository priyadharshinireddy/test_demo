package Web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {

	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
	    d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d1.manage().window().maximize();

		
		d1.get("http://www.leafground.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		jse.executeScript("scroll(0,550)");
}

}