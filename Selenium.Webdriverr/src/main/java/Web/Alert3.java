package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert3 {
	
@Test
	
	public void SweetAlert() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1;
	d1=new ChromeDriver();
	d1.get("http://www.leafground.com/pages/Alert.html");
	d1.manage().window().maximize();

        WebElement simpleAlert = d1.findElement(By.xpath("//button[@id='btn']"));
        String text = simpleAlert.getText();
        System.out.println(text);
        simpleAlert.click();
        Point location = d1.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println("Alert Location"+"("+x+","+y+")");
        d1.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

}
}
