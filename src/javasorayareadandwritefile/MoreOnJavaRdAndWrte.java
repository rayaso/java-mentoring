package javasorayareadandwritefile;

import java.io.*;

public class MoreOnJavaRdAndWrte {
    public static void main(String[] args) {
        //FileInputStream,it is used to read data from a file in the form of sequence of bytes

        String path = "C:\\Users\\soray\\JavaQuiz\\src\\javasorayareadandwritefile\\sorayaFile.txt";
        /*  File sorayaFile= new File(path); this method read the file as it is not eatch letter*/
        try {

            //to read a file  we have to follow those 3 steps:

            FileInputStream fis = new FileInputStream(path/* this is the path declared above*/ );
            /*this is an object,1 step this step means go inside file using input stream*/

            InputStreamReader isr = new InputStreamReader(fis);/*read something by caracter like
         one by one not the whole word,2 step,read the file witch we went inside by previous step*/

            BufferedReader br = new BufferedReader(isr);/*buffering takes more time to read something
            read character by character,bite by bite,3 step,this methode used to read file*/

            System.out.println(br.readLine());


            String myRead;
            while ((myRead = br.readLine()) != null) {/*unless it is not null read everything*/
                System.out.println(myRead);
            }

        } catch (FileNotFoundException f) {
            System.out.println("file not found");

        } catch (IOException i) {
            System.out.println("can not read from the file");
        }
    }
}

