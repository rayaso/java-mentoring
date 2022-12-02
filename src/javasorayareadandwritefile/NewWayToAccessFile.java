package javasorayareadandwritefile;

import java.io.File;
import java.util.Scanner;

public class NewWayToAccessFile {
    public static void main(String[] args) {


        //original methode:
        /*String path ="C:\\myFolder\\myText.txt"; this is the original version with slaches*/

        //devlopped methode after removing slashes:
        String path ="C:"+File.separator+"myFolder"+File.separator+"myText.txt";

        Scanner s = new Scanner(path);

        while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }





    }






}
