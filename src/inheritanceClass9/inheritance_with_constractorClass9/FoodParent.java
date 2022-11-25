package inheritance.inheritance_with_constractor;

public class FoodParent {
    int size;
    String nameOfFood;
    public FoodParent(int size, String nameOfFood){//this is a constractor
        //food class  say evryone extend from me has to declare my parameters in his class(size,nameoffood)
        //by ussing the word supper to reffer my parameters
        this.size=size;
        this.nameOfFood=nameOfFood;

    }

    void eatFood(){
        System.out.println("we are eating food");
    }


}
