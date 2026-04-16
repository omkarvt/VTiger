package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExelUtility;

public class FachingMultipleDatafromExel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\seleniumm.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Birds");
		DataFormatter df=new DataFormatter();
		/*Row r=sh.getRow(0);  
		for(int i=0;i<r.getLastCellNum();i++) {
			Cell c=r.getCell(i);
			String value=df.formatCellValue(c);
			System.out.println(value+" ");     //for getting the one row of data
		}*/ 
		/* for(int i=0;i<=sh.getLastRowNum();i++) {
			Row r=sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++) {
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				System.out.print(value+" ");			//this is for getting the whole data
				
			}
			System.out.println();
		}*/
		
		ExelUtility eutil=new ExelUtility();
		List<String> all=eutil.getMultipleDataFromExcel("Birds", 1, 1);  //using utility class	
		System.out.println(all);
	}

}
