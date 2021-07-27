package Web;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class PopScreenshot {
	
	
	@Test
	public void script() throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Alert.html");	
	
	d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	
		
		TakesScreenshot s1 = (TakesScreenshot) d1;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\latha\\OneDrive\\Desktop\\New folder\\screenshot3");
		
		FileHandler.copy(source, destination);

	
	
	}

}
