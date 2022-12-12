package javaintermediateclass12DataStructure;

import java.util.ArrayList;

public class LearnList {

    /*this is an exemple for array list,the deffrence between
    regular and array list that arraylist contains
    classes witch contains methods that we have access for exemple(remove methode)
     */

    public static void main(String[] args) {


       /* List myList = new ArrayList();/*list is an enterface that extends other interfaces so we have
        acess for defferent classes*/

       /*this is another methode to create array using arrayList methode,we usually use this
        methode because we have access for so many thing methods inside*/

        ArrayList<String> shoppingList = new ArrayList<>();/*arraylist is to create a relation between
        number and element*,we used list interface to create arraylist class*/

        shoppingList.add(0, "milk");/*we start with 0 cause it is array index*/
        shoppingList.add(1, "eggs");
        shoppingList.add(2, "bread");

        System.out.println(shoppingList.size());//size of our list
        System.out.println(shoppingList.contains("milk"));/*if our list contains milk*/
        System.out.println(shoppingList.get(1));//to get what 1 represent
        System.out.println(shoppingList.indexOf("bread"));//to get index of bread*/


        shoppingList.remove("bread");//to remove OBJECT
        shoppingList.remove(1);//TO remove with index


        for (String a : shoppingList) {
            System.out.println(a);
        }

    }


}


