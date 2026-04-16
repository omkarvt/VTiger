package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writingdatatoexel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\seleniumm.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Actors");
		Row r=sh.createRow(2);
		Cell c=r.getCell(0);
		c.setCellValue("xyz");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\seleniumm.xlsx");
		wb.write(fos);
		//ExelUtility eutil=new ExelUtility();
		//eutil.writeDataToExel("Actors", 4, 4, "omkar");
	}

}
