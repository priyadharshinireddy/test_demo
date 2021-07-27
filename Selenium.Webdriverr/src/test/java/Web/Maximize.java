package Web;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maximize {

	@Test
	public void script() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Alert.html");
	
	d1.navigate().back();
	d1.navigate().forward();
	d1.navigate().refresh();
	d1.navigate().to("http://www.leafground.com/pages/Window.html");
	
	d1.manage().window().maximize();
	
	Dimension dim =new Dimension(250,350);
	d1.manage().window().setSize(dim);
}
}
