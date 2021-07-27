package Web;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
	
	
	@Test
	public void script() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Window.html");
	
	d1.findElement(By.id("home")).click();
	
	Set<String> window_value=d1.getWindowHandles();
	
	Iterator<String> iter=window_value.iterator();
	
	String w1 = iter.next();
	
	String w2 = iter.next();
	
	d1.switchTo().window(w2);
	
	System.out.println(w1);
	
	System.out.print(w2);
	
	String title_child=d1.getTitle();
	
	System.out.println(title_child);
	
	d1.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
	Thread.sleep(2000);
	d1.close();

	d1.switchTo().window(w1);
	  d1 .findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
	 d1.close();
	  	
}

}
