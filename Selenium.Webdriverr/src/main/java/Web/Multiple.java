package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multiple {
	
	@Test
	public void isMultipledemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Dropdown.html");
	
		Select select = new Select(d1.findElement(By.xpath("//*[@id=\"dropdown1\"]")));
		select.selectByIndex(1);
		select.selectByIndex(3);
		if(select.isMultiple())
		{
		
		 Select select3 = new Select(d1.findElement(By.name("dropdown3")));
			select3.selectByValue("4");
	}
         Select select2 = new Select(d1.findElement(By.name("dropdown2")));
         select2.selectByVisibleText("Appium");
}

}
