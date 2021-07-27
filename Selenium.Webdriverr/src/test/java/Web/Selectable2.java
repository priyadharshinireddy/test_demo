package Web;



import java.io.File;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Selectable2 {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.get("http://demo.automationtesting.in/Selectable.html");
	  	  
	  	 d1.findElement(By.linkText("Serialize")).click();
         List<WebElement> ele1=d1.findElements(By.xpath("//*[@id=\"Default\"]/ul"));
	  	 
	  	 int size1=ele1.size();
	 	 System.out.println(size1);
	  	 
	  	Actions act1=new Actions(d1);
	  	
	  	act1.keyDown(Keys.CONTROL)
	  	.click(ele1.get(0))
	 	.click(ele1.get(2))
	  	.click(ele1.get(4))
	  	.click(ele1.get(6))
	  	.build().perform();
	  		 

	   TakesScreenshot s1=(TakesScreenshot)d1;
	  	
	  	File source=s1.getScreenshotAs(OutputType.FILE);
	  	File destination=new File("C:\\Users\\latha\\OneDrive\\Desktop\\New foldert\\screenshot\\shot3.jpg");
	  	FileHandler.copy(source,destination);
	
}
}



