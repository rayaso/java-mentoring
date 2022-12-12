package javasorayareadandwritefile;

import java.io.File;
import java.util.Scanner;

public class SorayaJavaRdTextFile {


    public static void main(String[] args) throws Exception{
        /*this method to read file in anywhere location ex(c)*/

        File s = new File("C:\\Users\\soray\\firstproject\\learningjava.txt");//to acess the file
        //System.out.println("my file is located in \"c:\\Users\\soray\\firstproject\"");

        Scanner t = new Scanner(s);/* we use scanner in this methode,we have another methode with buffers
        witch is showen in MoreOnJavaRdAndWrte,class but we prefer buffers than scanner because scans
        the whole file and than go line by line*/

        while (t.hasNextLine()) { //we use it to read multiple line

            System.out.println(t.nextLine());/*to read one line*/


        }
      System.getProperty("user.dir"); /*with this methode we tell java to bring the path for intlji
    text file*/
        System.out.println(System.getProperty("user.dir")+"\\src\\javasorayareadandwritefile\\sorayaFile.txt");

        //this method to read a file created in java*//*
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

//when we are naming the file do not add txt extention,it saves automaticly as txt file
