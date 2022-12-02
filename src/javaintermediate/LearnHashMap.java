package javaintermediate;

import java.util.HashMap;

public class LearnHashMap {/*used when we want to look for something java gonna look for that specific
thing.ex:if we want to look for 30 with this method java do not need to pass through 10 and 20 it goes
directly look for 30 because it has a key
,in this method we need to provid the index/key of the value,if we do not have index java
has to go through all the value to find 30*/


    public static void main(String[] args) {
        HashMap<Integer,String> myHash = new HashMap<>();
        myHash.put(1,"milk");
        myHash.put(2,"eggs");
        myHash.put(3,"sugar");

        System.out.println(myHash.get(2));
        System.out.println(myHash.keySet());
        System.out.println(myHash.values());




    }






}
