package Web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrool1 {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
	    d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d1.manage().window().maximize();

		
		d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html");
		WebElement ele1=d1.findElement(By.xpath("/html/body/div[2]/section[2]/div[1]/div/div[1]/div/p[5]"));
		
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		jse.executeScript("argument[0].scrollIntoView(true)", ele1);
		ele1.sendKeys("priya");

		

		

}
}