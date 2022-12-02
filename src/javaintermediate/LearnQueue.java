
package javaintermediate;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {/*this method is to add value and when you remove ,the first one will be removed*/

    public static void main(String[] args) {
        //First in first out

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

       /* for (int a : q) {

            System.out.println(q);*/

        q.poll();/*to remove the first item added.in this case we have to write a added methode in the
         bottom.it is the opposite of stack,in this case usually the one on the toop will be removed,(10)*/

       /* System.out.println(q);*/
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.contains(20));
        System.out.println(q.toArray()[2]);

        Queue<String> qs = new ArrayDeque<>();
        qs.add("hi");
        qs.add("hello");//print hi hello in one line
        System.out.println(qs);

        for(String b:qs){//print hi,hello separattly,this method is to print array
            System.out.println(b);
        }

               }


    }
