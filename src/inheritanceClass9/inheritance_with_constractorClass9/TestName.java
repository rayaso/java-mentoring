package inheritance.inheritance_with_constractor;

public class TestName {
    public static void main(String[] args) {
       /* Parent tuna = new Parent(10, "tuna");
        Child myTuna = new Child(true, 10);//this is a cinstractor where we pass parameters
        we dont need these objects anymore

        */
TunaFoodChild myTuna=new TunaFoodChild(true,10,10,"tuna");/*
we created the relationship between two classes we inhireted thats whey we have acess for evrything
insted creating so many objescts.just make this relation between classe and call thats class thats
 inheritaded evrything  from parent class
 so evrything come
 as soon as we creat an obj for child class we are also creating aan object for parent class that
 whey we need to provid both value
*/
        System.out.println(myTuna.isItFrozen);
        System.out.println(myTuna.Weight);
        System.out.println(myTuna.size);
        myTuna.eatFood();



    }

}
