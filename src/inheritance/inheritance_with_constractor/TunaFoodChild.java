package inheritance.inheritance_with_constractor;

public class TunaFoodChild extends FoodParent {//in order to access size and nameoffood from parent
boolean isItFrozen;
int Weight;
public TunaFoodChild(boolean isItFrozen, int Weight, int size, String nameOfFood){//this is a constractor
    super(size,nameOfFood);//shild class has to know evrything from parent thats whey we calling parents
    //parameters
    //this exemple is just for constractor,but when extending from class that has other thing
    //we have to import it and declare it too
    this.isItFrozen=isItFrozen;
    this.Weight=Weight;



        super.eatFood();//i called eatfood methode from parentclass to child
    // methode class so i have to use the word super
    //because it heritat.there is a relation beetween
    //needs to be executed first cause it is from parent
        System.out.println("eating tuna");




    }

}





