package Web;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectable {
	
	

	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> ele1=d1.findElements(By.xpath("//ol[@id=\'selectable\']/li"));
		
		int size_list = ele1.size();
		
		System.out.println(size_list);
		
		Actions act1= new Actions(d1);
		
		act1.keyDown(Keys.CONTROL)
		.click(ele1.get(0))
		.click(ele1.get(2))
		.click(ele1.get(4))

		.click(ele1.get(6))
		.build().perform();
	
}
}
