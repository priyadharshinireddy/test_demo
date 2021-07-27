package Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert2 {
	
	@Test
	public void script() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	
    d1.get("https://demoqa.com/alerts");
    d1.manage().window().maximize();
    
    // This step will result in an alert on screen
    WebElement element = d1.findElement(By.id("promtButton"));
    ((JavascriptExecutor) d1).executeScript("arguments[0].click()", element);
    Alert promptAlert  = d1.switchTo().alert();
    String alertText = promptAlert.getText();
    System.out.println("Alert text is " + alertText);
    
    //Send some text to the alert
    Thread.sleep(5000);
    promptAlert.sendKeys("priya");
    promptAlert.accept();
    Thread.sleep(5000);
    String text = d1.findElement(By.xpath("//span[@id='promptResult']")).getText();
    System.out.println(text);

}
}
