package Functionality;
        import java.io.File;  
        import java.io.FileInputStream;  
	    import java.io.IOException;  
	    import org.apache.poi.hssf.usermodel.HSSFSheet;  
	    import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
	    import org.apache.poi.ss.usermodel.Cell;  
	    import org.apache.poi.ss.usermodel.FormulaEvaluator;  
	    import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;  
	    
		public class Ap {

	    @Test
	    public  void Script1() throws IOException  {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\latha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1=new ChromeDriver();
	    {  
	    
	    FileInputStream fis=new FileInputStream(new File("C:\\Users\\latha\\OneDrive\\Documents\\ApacheNew.xls"));  
	     
	    HSSFWorkbook wb=new HSSFWorkbook(fis);   
	     HSSFSheet sheet=wb.getSheetAt(0);  
	      FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
	    for(Row row: sheet)       
	    {  
	    for(Cell cell: row)    
	    {  
	    switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
	    {  
	    case NUMERIC:   
	    System.out.print(cell.getNumericCellValue());   
	    break;  
	    case STRING:    
	    System.out.print(cell.getStringCellValue());  
	    break;  
	    }  
	    }  
	    System.out.println();  
	    }  
	    }  
	    }  
		
	}
		
		