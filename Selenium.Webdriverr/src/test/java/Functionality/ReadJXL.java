package Functionality;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadJXL {
	

	@Test
	public void script1() throws BiffException, IOException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
        Workbook w1 = Workbook.getWorkbook(new File("C:\\\\Users\\\\latha\\\\OneDrive\\\\Documents\\read1.xls"));
				Sheet s1=w1.getSheet(0);
				
				for (int i=1;i<s1.getRows();i++) {
					String user_name= s1.getCell(0,i).getContents();
					String password=s1.getCell(1,i).getContents();
					
					d1.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&prevRID=TEEX3JEPBY2174BC4GDH&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			        d1.findElement(By.id("ap_customer_name")).sendKeys(user_name);
			        d1.findElement(By.id("ap_password")).sendKeys(password);
			        
			        d1.findElement(By.id("continue")).click();
			        
			        
			        
			        
				
				}
				
}
}
