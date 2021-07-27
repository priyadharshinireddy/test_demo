package Functionality;

	import java.awt.AWTException;

	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

	public class upload {
@Test
public void script1()throws AWTException {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d1 = new ChromeDriver();
	d1.get("https://www.ilovepdf.com/excel_to_pdf");
	
	WebElement Upload = d1.findElement(By.id("pickfiles"));
	Upload.click();

	//control + c
	String file ="C:\\Users\\latha\\OneDrive\\Documents\\testleaf.xls";
	StringSelection selection = new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	//control + v
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);




	
	}

	}


