package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait {
	
	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		//Implicit
	    d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	       d1.get("http://www.leafground.com/");
	       
	       d1.findElement(By.linkText("Edit")).click();
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");
			
			//Explicit frame
			WebDriverWait wait = new WebDriverWait(d1,20);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("email")));
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");	
			
			//Explicit alert

			WebDriverWait wait1 = new WebDriverWait(d1,20);
			wait1.until(ExpectedConditions.alertIsPresent());
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");	
			
			//Explicit dropdown
			WebDriverWait wait2 = new WebDriverWait(d1,20);
			wait2.until(ExpectedConditions.elementToBeSelected(By.id("email")));
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");	
			
			//Explicit Button
			WebDriverWait wait3 = new WebDriverWait(d1,20);
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");	
			
			//Explicit Textbox
			WebDriverWait wait4 = new WebDriverWait(d1,20);
			wait4.until(ExpectedConditions.elementToBeClickable(By.id("email")));
			d1.findElement(By.id("email")).sendKeys("priya@gmail.com");	
	
}

}
