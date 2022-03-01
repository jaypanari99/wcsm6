package handlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// write the data in the excel file
		
		FileInputStream fis = new FileInputStream("./data/TestData1.xlsx");  // make the excel file ready for the read operation
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("City");  // go to sheet
        Row row = sh.getRow(0);   // go to the row   
        
        Cell cell = row.createCell(1);  // make the cell ready to write the operation by removing all the data of that cell
        cell.setCellValue("xyz");  // set cell data
        
        FileOutputStream fos = new FileOutputStream("./data/TestData1.xlsx");
        wb.write(fos);  //write the data
        wb.close();  
        
        
        
	}

}
