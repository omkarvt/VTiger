package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is utility class which deals with the exel file
 * @author omkar
 * @version 26-03-23
 */
public class ExelUtility {
	/**
	 * this is generic  method to fatch single data from exel file
	 * @param sheet
	 * @param rowindex
	 * @param cellindex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromeXel(String sheet,int rowindex,int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathutility.exelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheet).getRow(rowindex).getCell(cellindex);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		return value;
		
		
	}
	/**
	 * this is generic  method to fetch multiple cell data from exel file
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultipleDataFromExcel(String sheetName, int startRowIndex,
            int startCellIndex)throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(IPathutility.exelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		List<String> al = new ArrayList<String>();

		for (int i = startRowIndex; i <= sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for (int j = startCellIndex; j < r.getLastCellNum(); j++) {
					Cell c = r.getCell(j);
					String value = df.formatCellValue(c);
					al.add(value);
}
}

		return al;
}
	/**
	 * this is the generic method to 
	 * @param sheetname
	 * @param rowindex
	 * @param cellindex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataToExel(String sheetname,int rowindex,int cellindex,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathutility.exelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row r =sh.getRow(rowindex);
		Cell c=r.createCell(cellindex);
		c.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(IPathutility.exelpath);
		wb.write(fos);
	}
	

}
