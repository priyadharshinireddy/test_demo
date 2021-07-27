package Web;



import java.awt.Dimension;


import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot {
	

    @Test
    public void script1() {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver d1;
    	d1=new ChromeDriver();
    	d1.get("http://www.leafground.com/pages/Alert.html");
        d1.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
        
         Ppp robot1=new Ppp();
        
        Dimension screen_size= Toolkit.getDefaultToolkit().getScreenSize();
        
        Rectangle rect1 = new Rectangle(screen_size);
        
        Thread.sleep(2000);

        
        robot1.createScreenCapture(rect1);
                
        File destination = new File("C:\\Users\\latha\\OneDrive\\Desktop\\New folder\\screenshot1");
        
        ImageIO.write(source, "jpg", destination);
        
       
        
       


	}
}
