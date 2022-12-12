package java_curseur_iterator;

import java.util.*;

public class ListIteratorTypeTwo {

    public static void main(String[] args) {

        //this is second type of iterator(list iterator):
        //with this type we can go with both direction

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);

        ListIterator li = al.listIterator();//has 2 direction because has 2 method(.hasnext,.hasprevious)

        System.out.println("print forward (top to bottom).....");
        while (li.hasNext()){//we have to add usually this methode with iterator (while)

            System.out.println(li.next());

        }

        System.out.println(".....print backward (bottom to top)");
        while (li.hasPrevious()){

            System.out.println(li.previous());
        }

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"ny");
        hm.put(2,"tx");
        hm.put(3,"mn");

        Iterator<Map.Entry<Integer,String>> itr=hm.entrySet().iterator();//1st methode
        Iterator s =hm.entrySet().iterator();//2nd method(1st=2nd)

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
