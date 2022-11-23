package romel;

public class ByteClass {

   //Create a method with two parameters and return
    //multiplications of those two as parameters,
    //call the method inside main method and pass the argument as 50 and 60.

    int multi(int x, int y){

        return x*y;

    }

    public static void main(String[] args) {

        ByteClass obj = new ByteClass();

        System.out.println(obj.multi(50,60));

    }
}
