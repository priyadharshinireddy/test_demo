package Web;



import java.awt.AWTException;
import java.awt.Dimension;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ppp {
	

    @Test
    public void script1() throws AWTException, IOException, InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://www.leafground.com/pages/Alert.html");
        d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        
         Robot robot1=new Robot();
        
        Dimension screen_size= Toolkit.getDefaultToolkit().getScreenSize();
        
        Rectangle rect1 = new Rectangle(screen_size);
        
        Thread.sleep(2000);

        
      BufferedImage source = robot1.createScreenCapture(rect1);               
        File destination = new File("C:\\Users\\latha\\OneDrive\\Desktop\\New folder\\screenshot6");
        
        ImageIO.write(source, "jpg", destination);
        
       
      
	}
}
