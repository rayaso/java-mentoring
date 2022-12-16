package javaExamSubmission;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadExelFileSoraya {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\soray\\OneDrive\\Documents\\java final exam.xlsx";

        FileInputStream exel = new FileInputStream(path);
        XSSFWorkbook SORAYA = new XSSFWorkbook(exel);
        XSSFSheet Sheet = SORAYA.getSheet("Sheet1");
        int row = Sheet.getLastRowNum() + 1;
        int column = Sheet.getRow(0).getLastCellNum();
        String[][] rowColumn = new String[row][column];
        for (int a = 0; a < row; a++) {
            XSSFRow employee = Sheet.getRow(a);
            for (int b = 0; b < column; b++) {
                String value = employee.getCell(b).toString();
                rowColumn[a][b] = value;
                System.out.print(value + "\t\t");

            }
            System.out.println();
        }

        SORAYA.close();
        exel.close();


    }


}
