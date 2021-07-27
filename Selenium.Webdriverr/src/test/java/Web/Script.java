package Web;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script {

	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('datepicker1').value='29/09/2017'");
		
		JavascriptExecutor jse1=(JavascriptExecutor) d1;
		jse1.executeScript("document.getElementById('datepicker2').value='12/12/2012'");
}
}
