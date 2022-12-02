package javasorayareadandwritefile;

import java.io.File;
import java.util.Scanner;

public class SorayaJavaRdTextFile {


    public static void main(String[] args) throws Exception{
        /*this method to read file in anywhere location ex(c)*/

        File s = new File("C:\\Users\\soray\\firstproject\\soniaText.txt");//to acess the file
        System.out.println("my file is located in \"c:\\Users\\soray\\firstproject\"");
        Scanner t = new Scanner(s);
        while (t.hasNextLine()) { //we use it to read multiple line

            System.out.println(t.nextLine());/*to read one line*/


        }
/*this method to read a file created in java*/
      System.getProperty("user.dir"); /*with this methode we tell java to bring the path for intlji
    text file*/
        System.out.println(System.getProperty("user.dir")+"\\src\\javasorayareadandwritefile\\sorayaFile.txt");

       //1st way:
       String absolutePath = System.getProperty("user.dir");
       String relativePath = "\\src\\javasorayareadandwritefile\\sorayaFile.txt";
       File PP = new File(absolutePath+relativePath);
       Scanner z = new Scanner(PP);
        System.out.println(z.nextLine());//read the first line
        while (z.hasNextLine()){// read other lines
        System.out.println(z.nextLine());}


        //2nd way:
File rr = new File(System.getProperty("user.dir")+"\\src\\javasorayareadandwritefile\\sorayaFile.txt");
    }
}
