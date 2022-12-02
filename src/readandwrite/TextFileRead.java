package readandwrite;

import java.io.File;
import java.util.Scanner;

public class TextFileRead {
    public static void main(String[] args) throws Exception
        /*(throws exception)
    this used when java can not find a file this command means try to find (f) file
    if you do not go ahead and do something else it refer to scanner example*/
    {
      System.out.println("hello everyone, hwo are doing?  \n the weather in NYC bit chilli. ");/*this
        commend is to print in line by line 1st sentence in line1,and than 2nd sentence ,number(n)
        is for new line*/


        System.out.println("the current weather is\" 60 F\"");/*va imprimer "60 F"*/

        System.out.println("Exception handling\t1.");/* gonna print a space before 1 and than 1.*/

       System.out.println("i want to delete last characters\b");/*this commend is to delete last number*/


        /*THIS 1ST METHODE IS TO READ JAVA FILE SAVED IN OTHER LOCATION THAN INTILJI*/

        File f=new File("C:\\myFolder\\myText.txt");/*java does not recognize back slash so we have to add
       another slash witch mean take it as it is so take it as a slash
        */

       File fl =new File("C:\\myFolder\\myText.txt")/*this path of file that we created
        myfile.txt witch is saved in c we just copied the path where is located by just clicking on it*/;

        System.out.println("my file is located in \"c:\\myFolder\"");/* take the slash as it is
        by adding anther slash because java does not recognize a slash ,we added a slash between
        c and my folder because we need to skip the existed slash we dont need java to print tha
        slash cause it is not part of our code,and we added another slash with cotation after
        folder because we need to print the existed cotation*/



        Scanner/*can read our files too not just scan*/ s = new Scanner(fl)/*this (f) is the same
        with (f)file*/;
        System.out.println(s.nextInt());/*print just one line*/

        /*to read every single line if we have more than 1 line we use this commend below: */

        while (s.hasNext());{
        System.out.println(s.nextLine());/*print all the line*/
    }
/*THIS SOUT IS FOR READ JAVA TXT FILE INSIDE file myfolder created inside INTiLJI*/

   System.out.println(System.getProperty("user.dir")+"\\src\\readandwrite\\myFile.txt");

        /*we use this in order to get the location of folder ,got the path with right click
        * on myfile and choose copy path reference and path from contenet root*/

        String absolutePath=System.getProperty("user.dir");
        String relativePath="\\src\\readandwrite\\myFile.txt";

File mf=new File(absolutePath+relativePath);

Scanner sc =new Scanner(mf);
        System.out.println(sc.nextLine());

    }

}
