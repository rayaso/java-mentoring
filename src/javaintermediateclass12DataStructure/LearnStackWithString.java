package javaintermediateclass12DataStructure;

import java.util.Stack;

public class LearnStackWithString {//if we put something in toop the first,last object will be delete
//pushing items and last one will be deleted
    public static void main(String[] args) {
        Stack<String> sorayaList = new Stack<>();
        sorayaList.push("garlic");/*we need to add items on the top,we have to add push methode in the
        first everytime i need to add somethig ,do not whrite added methode regulary like in the botton
        here is the opossit,to have onion deleted ,we need to write a new methode with added item first
        ligne*/

        sorayaList.push("milk");//gonna be added in the top
        sorayaList.push("sugar");//gonna be added in the top
        sorayaList.push("banana");
        sorayaList.push("onion");
        sorayaList.push("orange");

        sorayaList.pop();// presure on it cause we added items than delete the last one



        for(String a:sorayaList){
            System.out.println(a);



        }





    }








}
