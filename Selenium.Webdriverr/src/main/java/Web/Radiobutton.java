package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobutton {
	
	@Test
	public void script1() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
			d1.get("http://www.leafground.com/pages/radio.html");
			d1.findElement(By.id("yes")).click();
			d1.findElement(By.name("news")).click();
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).click();
			d1.close();
			
}

}
