package javamentoring;

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner sc=new java.util.Scanner(System.in);

        int x=sc.nextInt();
        System.out.println("write a number");

        int y=sc.nextInt();
        System.out.println("write another number");

        if(x>y){
            System.out.println("the second number is smaller");
        }else if(y>x){
            System.out.println("the first number is smaller");
        }else if(x==y){
            System.out.println("the numbers are equals");
        }

        sc.close();




    }







}
