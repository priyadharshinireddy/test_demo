package Functionality;

	
	
		
		import java.io.File;
		//import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;

		 

		//import org.apache.poi.sl.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.CellType;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		//import org.openqa.selenium.WebDriver;
		//import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.Test;
		
		public class Write {


		 

		  @Test
		  public void script1() throws IOException {
		      
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      
		    //  WebDriver d1;
		      //d1=new ChromeDriver();
		      
				String file1=("C:\\Users\\latha\\OneDrive\\Documents\\ApacheWrite.xls");
		      File f1=new File(file1);
		      FileOutputStream Fw=new FileOutputStream(f1);
		       XSSFWorkbook w1=new XSSFWorkbook();
		     XSSFSheet sheetone= w1.createSheet("selenium");
		     Row r1=sheetone.createRow(5);
		         Cell c1=r1.createCell(6);
		     c1.setCellType(CellType.STRING);
		     c1.setCellValue("Priya");
		     w1.write(Fw);


	  
	}
		}


