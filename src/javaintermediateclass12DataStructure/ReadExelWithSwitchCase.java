/*package javaintermediateclass12DataStructure;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExelWithSwitchCase {


    public static void main(String[] args) {


        String path = "C:\\Users\\soray\\OneDrive\\Documents\\sorayaexelfile.xlsx";
        String mySheetPath = "Sheet1";

        try {
            FileInputStream fis = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet Sheet = workbook.getSheet(mySheetPath);

            int myRow = Sheet.getLastRowNum() + 1;
            int myCol = Sheet.getRow(0).getLastCellNum();

            for (int r=0;r<myRow;r++){
                XSSFRow readRow=Sheet.getRow(r);

                for (int c=0;c<myCol;c++){
                    XSSFCell readCell = readRow.getCell(c);

                    switch (readCell.getCellType()){
                        case STRING:
                        System.out.println(readCell.getStringCellValue() + "\t\t");
                        break;
                        case NUMERIC:
                            System.out.println(readCell.getNumericCellValue()+"\t\t");
                            break;
                        case BOOLEAN:
                            System.out.println(readCell.getBooleanCellValue()+"\t\t");
                            break;
                        default:
                            System.out.println("value is not readable");
                    }
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
*/