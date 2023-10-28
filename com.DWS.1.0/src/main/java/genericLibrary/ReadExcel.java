package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static Object[][] multiplereadsdata(String sheetName) throws EncryptedDocumentException, IOException {
		   
		   File file=new File("C:\\Users\\nisht\\Downloads\\Eclipse workspace-20231011T062102Z-001\\Eclipse workspace\\com.DWS.1.0\\src\\test\\resources\\TestData\\TestdataListeners (1).xlsx");
		   FileInputStream fis=new FileInputStream(file);
		   Workbook workbook=WorkbookFactory.create(fis);
		   Sheet sheet=workbook.getSheet(sheetName);
		   int rowNum=sheet.getPhysicalNumberOfRows();
		   int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		 // Modifying the normal code by reinitializing from i=1 and other changes so as to remove null values and first row headings of excel sheet username and password
		   //int [][] twodim=new int[rowNum][colNum];
		   Object[][] data=new Object[rowNum-1][colNum];
		   for(int i=1;i<rowNum;i++){
			   for(int j=0;j<colNum;j++){
			
	 		   data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			  }
		   }  	   
		  return data;	      
	  }
}

