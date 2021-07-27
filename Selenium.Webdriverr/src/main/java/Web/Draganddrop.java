package Web;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draganddrop {

	
	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		//Implicit
	    d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d1.get("http://www.leafground.com/pages/drop.html");
	    
	    WebElement from = d1.findElement(By.id("draggable"));
	    WebElement to = d1.findElement(By.id("droppable"));

	    Actions actions = new Actions(d1);

	    actions.clickAndHold(from).moveToElement(to).build().perform();
}
}