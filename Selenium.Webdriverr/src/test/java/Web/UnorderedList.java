package Web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UnorderedList {
	
	@Test
	public void script1() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/AutoComplete.html");
		
		
		d1.findElement(By.id("searchbox")).sendKeys("A");
		
        List<WebElement> ele1 = d1.findElements(By.xpath("/html/body/section/div[1]/div[2]/div[1]/div"));
		
		int size1=ele1.size();
		System.out.println(size1);
		
		for (WebElement element_value :ele1) {
			
			if(element_value.getText().equalsIgnoreCase("Belgium")) {
				
				element_value.click();
				
				break;
				
				
				
		

}
			
		}
		
		TakesScreenshot s1 = (TakesScreenshot) d1;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\latha\\OneDrive\\Desktop\\New folder\\screenshot4");
		
		FileHandler.copy(source, destination);

	}
}
