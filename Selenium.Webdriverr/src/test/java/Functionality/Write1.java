package Functionality;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Write1 {
	
	@Test
	public void script1()   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
	String file1=("C:\\Users\\latha\\OneDrive\\Documents\\ApacheWrite.xls");
	File f1 = new File(file1);
	
	FileOutputStream fw1 = new FileOutputStream(f1);
	XSSFWorkbook w1=new XSSFWorkbook();
	XSSFSheet s1=w1.createSheet("Selenium");
	
	Row r1 = s1.createRow(5);
	Cell c1= r1.createCell(6);
	
	c1.setCellType(CellType.STRING);
	c1.setCellValue("Priya");
	
	w1.write(fw1);
	
	
	
	}

}
