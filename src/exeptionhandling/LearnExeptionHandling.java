package exeptionhandling;

public class LearnExeptionHandling {
    //public static void main(String[] args) {
    // int x = 10;//if we do not have semicolom here is a mistake we can handle this situation in java
    // System.out.println("hello");


    public static void main(String[] args) {

        try {
            String[] arr = {"hi", "hello", "azul"};


            //length of array is the highest number of variable -1 =3variables
            //-1=2 so the lenght of array is 2 witch is the index

            System.out.println(arr[2]);
            System.out.println(arr[3]);
        }//runtime error we do not have index 3 value

        catch (Exception soraya) {
            System.out.println("we can not find that value");
            soraya.getMessage();//get the message that you will get if you do not use catch method


/*we need to use try/catch exception to find the mistake and continue running the program,if we do not
have this method inside our code the java stop running our code we it find mistake*/

//this is hwo to handle exeption by adding try/catch and continue executing your programme
            //inside catch methode we add the word(arithmetic)before exception to go direcctly
            //  to arrithmetic probleme than we can add other key word as what the type  exception is


            int[] sonia = {};
            try {
                System.out.println(sonia[2]);
            } catch (NullPointerException n) {
                System.out.println("your array has null value");
            } catch (ArrayIndexOutOfBoundsException m) {

                System.out.println("your array is out of bound");}

            /*it print this one because we do not have null
    in int variable is just curly braces,but if we change braces with null it will print the
    first method*/

            catch (Exception k) { /*if there is other problem than catch1 and catch2 we use this in
             general it catch all problem not just what we specified as catch1 and catch2*/

                k.getMessage();{
                    System.out.println("i can not find that value");
                }
            }

        }


    }
}

