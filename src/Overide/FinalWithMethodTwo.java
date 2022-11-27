package Overide;


public class FinalWithMethodTwo extends FinalWithMethode{
    void mOne(){
        super.mOne();//we use super to call methode located in parent folder if we need to print the both
        //this super methode shold be before psvm so it can print it

        System.out.println("second");//this methode is in child class only.

    }

    public static void main(String[] args) {
        FinalWithMethode obj=new FinalWithMethodTwo();/*creating an object to access the first methode*/
        obj.mOne();

    }




}

