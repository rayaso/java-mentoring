package javasorayareadandwritefile;

import java.io.FileWriter;

public class SorayaJavaWrteTextFile {
    public static void main(String[] args) throws Exception {

        FileWriter letti = new FileWriter("C:\\myFolder\\angel.txt");/*  we provide
        angel.txt the name of file
        that i want to create;myfolder is the location where i want to creat it*/

        letti.write("hello my name is letti");/*i have to shoose option string to write inside braces
        with this methode iam writing inside the file*/

        letti.close();







    }




}
