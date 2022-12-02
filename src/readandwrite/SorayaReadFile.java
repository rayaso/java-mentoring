
package readandwrite;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SorayaReadFile {
    public static void main(String[] args) throws IOException {

        File t = new File("C:\\myFolder\\myText.txt");

      /* System.out.println("my file is located in \"c:\\myFolder\"");*/



        Scanner H = new Scanner(t);     /*we have to shose scanner file source*/



        System.out.println(H.nextLine());

        System.out.println(System.getProperty("user.dir"));


    }


}
