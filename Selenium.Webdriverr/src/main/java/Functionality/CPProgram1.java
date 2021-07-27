package Functionality;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class CPProgram1 {
	
	@Test
	public void script1() throws BiffException, IOException   {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();

	FileInputStream f1 = new FileInputStream("src//main//java//Functionality//Config.properties");
	Properties prop = new Properties();
	prop.load(f1);

	String browser =prop.getProperty("browser");
	String path = prop.getProperty("path");

	if(browser.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", path );
	d1 = new ChromeDriver();

	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver",path );
	d1 = new FirefoxDriver();
	}

	}
}



