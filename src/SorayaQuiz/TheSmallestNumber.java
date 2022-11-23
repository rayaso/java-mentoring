package SorayaQuiz;


import java.util.Scanner;

public class TheSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Write a number");
        int y = sc.nextInt();
        System.out.println("write another number");
        if (x > y) {
            System.out.println("the first number is smaller");
        } else if (y > x) {
            System.out.println("the second number is smaller");
        } else {
            System.out.println("the numbers are equal");
        }
        sc.close();
    }
}