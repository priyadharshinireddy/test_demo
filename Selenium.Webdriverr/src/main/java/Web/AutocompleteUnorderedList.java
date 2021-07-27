package Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutocompleteUnorderedList {
	
	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/autoComplete.html");
		
		
		d1.findElement(By.id("tags")).sendKeys("A");
		
        List<WebElement> ele1 = d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		int size1=ele1.size();
		System.out.println(size1);
		
		for (WebElement element_value :ele1) {
			
			if(element_value.getText().equalsIgnoreCase("SOAP")) {
				
				element_value.click();
				
				break;

}
		}
	}
}
