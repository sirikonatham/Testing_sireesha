package genericlibraries;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;

public class DataUtilities {
	
     public String readingProperytFile(String data) throws FileNotFoundException, IOException
     {
    	 Properties properties=new Properties();
    	 properties.load(new FileInputStream(AutoConstant.dataPropertyFile));
    	 return properties.getProperty(data);
     }
     
     
     public String readingExcelFile(String sheetname,int rowno,int colno) throws EncryptedDocumentException, IOException
     {
    	FileInputStream fis=new FileInputStream(AutoConstant.excelPropertyFile);
    	Workbook workbook = WorkbookFactory.create(fis);
    	return workbook.getSheet(sheetname).getRow(rowno).getCell(colno).getStringCellValue();
    	
     }
}
