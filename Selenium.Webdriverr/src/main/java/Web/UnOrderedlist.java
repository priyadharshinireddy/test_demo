package Web;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnOrderedlist {
	
	
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
	}
}
