package Revision;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAndCheckExcel {

    public static void main(String[] args) throws Exception {

        // --------- WRITE DATA ---------
      
        FileInputStream fis = new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\seleniumm.xlsx");
        Workbook wb1 = WorkbookFactory.create(fis);
        Sheet sh1 = wb1.getSheetAt(0);

        int rows = sh1.getPhysicalNumberOfRows();
        int cols = sh1.getRow(0).getPhysicalNumberOfCells();

        // --------- CONDITION ---------
        if (rows == 2 && cols == 2) {

            System.out.println("Excel is 2x2 format. Printing data:\n");

            for (int i = 0; i < rows; i++) {
                Row r = sh1.getRow(i);

                for (int j = 0; j < cols; j++) {
                    Cell c = r.getCell(j);
                    System.out.print(c.toString() + "   ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Excel is NOT 2x2 format");
        }

        wb1.close();
    }
}