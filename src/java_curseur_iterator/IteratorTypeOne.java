package java_curseur_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTypeOne {

    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("ny");
        states.add("az");
        states.add("nj");
        states.add("tx");

          /*this is thype one of iterator(hasnext)we have to add next method to go to the next,can used
          just for one direction forward with next,has just one methode(.hasnext):
           */

        Iterator soraya= states.iterator();/*(this is a variable it is not an object ,we assigned
        (states.iterator)to(soraya) wich is type iterator,the same with int x=10
        used to retrieve all the states values,it means
         show me the value*/

while (soraya.hasNext(/*to iterate we have to use .hasnext methode of iterator ,go inside arraylist
and see if there are more than one element ,if there are it will go to next one using another
method (next)*/)){

    System.out.println(soraya.next());




        }



    }






}
