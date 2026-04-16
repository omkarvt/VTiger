package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.Format;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FatchingExelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\seleniumm.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("cartoons");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		/*String value=c.getStringCellValue();
		System.out.println(value);
		
		Cell c2=wb.getSheet("Actors").getRow(8).getCell(3);
		String value1=c2.getStringCellValue();
		System.out.println(value1);
		
		Cell c3=wb.getSheet("animals").getRow(0).getCell(0);
		String value3=c3.getStringCellValue();
		System.out.println(value3);
		
		Cell c4=wb.getSheet("cartoons").getRow(1).getCell(4);
		double d=c4.getNumericCellValue();
		System.out.println(d);*/
		
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);
		
		Cell c1=wb.getSheet("cartoons").getRow(1).getCell(4);
		String value2=df.formatCellValue(c1);
		System.out.println(value2);
		
		
		
		
		
		
		
		
	}

}
