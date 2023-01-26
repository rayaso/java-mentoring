/*package javaintermediateclass12DataStructure;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExelFile {
    //IO means input,output


    public static void main(String[] args) throws IOException {

//this is a variable of path:
        String path = "C:\\Users\\soray\\OneDrive\\Documents\\sorayaexelfile.xlsx";

        //to read the exel file we have to follow those 3 steps:


        //we are accessing the file with fileinputstream:
        FileInputStream fis = new FileInputStream(path);//stepe1

        XSSFWorkbook soraya = new XSSFWorkbook(fis);//acess workbook:step2

        XSSFSheet Sheet = soraya.getSheet("Sheet1");//ACCESSING THE Sheet in exel:step3


        int row = Sheet.getLastRowNum()+1/* +1 to get started by the value of 0 index,because this methode
        already has -1 so we add +1 so we grt =0 and the code start looking from 0 index*/;

      /*int column = Sheet.getRow(0).getLastCellNum();//cell=column

        String[][] rowcol=new String[row][column];

      /* for (int a = 0/*start with 0 row*/;// a < row; a++) {/*get all the values of row and*/
      /* put it in sonia wich is XSSFRow(the class that we dowload apache type,we created a variable*/

         /*   XSSFRow sonia = Sheet.getRow(a);

            for (int b = 0; b < column; b++) {
                String value = sonia.getCell(b).toString();/*get all value of column and put it
                inside value wich is a string type*/
               /* rowcol[a][b] = value;

                System.out.print(value + "\t\t");

            }
            System.out.println();
        }
        soraya.close();
        fis.close();
    }


}*/
