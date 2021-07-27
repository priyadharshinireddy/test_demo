package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {

	
	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/");
		d1.findElement(By.linkText("Edit")).click();
		d1.findElement(By.id("email")).sendKeys("priya@gmail.com");
		d1.findElement(By.cssSelector("input[value=\"Append \"]")).clear();
		d1.findElement(By.cssSelector("input[value=\"Append \"]")).sendKeys("Priya");
		d1.findElement(By.name("username")).clear();
		d1.findElement(By.name("username")).sendKeys("Pr");
		d1.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		System.out.println("status");
	
	
	}
}
