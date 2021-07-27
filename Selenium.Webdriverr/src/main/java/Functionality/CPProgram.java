package Functionality;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CPProgram {
	
	
	@Test
	public void readconfig() throws IOException {
	WebDriver d1;

	FileInputStream stream = new FileInputStream("src//main//java//Functionality//Config.Properties");
	Properties properties = new Properties();
	properties.load(stream);

	String browser =properties.getProperty("browser");
	String path = properties.getProperty("path");

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

