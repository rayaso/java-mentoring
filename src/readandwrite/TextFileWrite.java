package readandwrite;

import java.io.FileWriter;
import java.io.Writer;

public class TextFileWrite  {
    public static void main(String[] args) throws Exception{

        /* i am creating a folder by this method*/

        FileWriter sonia=new FileWriter("C:\\myFolder\\soraya.txt");
        sonia.write("hello");
        sonia.close();
    }







}
