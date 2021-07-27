package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {

	
	@Test
	public void script() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Alert.html");	
	
	d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	String msg=d1.switchTo().alert().getText();
	d1.switchTo().alert().accept();
	System.out.println(msg);
	
	d1.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	String s=d1.switchTo().alert().getText();
	d1.switchTo().alert().dismiss();
	System.out.println(s);
	
	d1.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
	String s2=d1.switchTo().alert().getText();
	d1.switchTo().alert().accept();
	System.out.println(s2);
	
	
	}
}
