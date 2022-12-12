package javaintermediateclass12DataStructure;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDriver {

    public String path;
    public String SheetName;

    public  static  void callexel(String path,String SheetName)throws IOException {

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook worbook = new XSSFWorkbook(fis);

        XSSFSheet Sheet = worbook.getSheet("SheetName");



    }





}
