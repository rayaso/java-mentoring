package javaintermediateclass12DataStructure;

import java.util.Stack;

public class LearnStackWithInteger {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();


        myStack.push(10);
        myStack.push(20);
       myStack.pop();
        myStack.pop();

        // will not print anything because we did pop twice and we have just 2 values

        for (int a : myStack) {
            System.out.println(a);
        }

        System.out.println(myStack.peek());/*when we use this methode we have to comment out other method
        as pop methode and println methode;this peek in stack take the last value in list
        System.out.println(myStack.search(20));//to locate the specific number*/


    }




}
