package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hyperlink {
	
	@Test
	public void script1() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
			d1.get("http://leafground.com/pages/Link.html");
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a"));
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/label"));
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/a")).click();
			d1.close();
			

}
}