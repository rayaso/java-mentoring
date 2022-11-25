package inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Salmon sm = new Salmon();
        /*sm. everything came from food (variable/Methode)even salmon class is empty cause
         it is inheritant from food evreything so thats whey we can have access to size,weught from food*/
        //coming from parent class that is food
        sm.name = "salmon1";
        sm.size = 12;
        sm.weight = 500;
        System.out.println(sm.name);
        Apples a=new Apples();
        //comming from parent class or class that we extends from
        a.name="Red Apples";
        a.size=20;
        a.weight=200;
        //this is coming from childclass apples
        a.isRedOrGreen="Red";
        a.isRed=true;
        a.drinkJuice();
        Food s=new Salmon();//is true cause food has knowledge of salmon ,salmon inheritand food
       // Salmon=new Food();we cant because food is parent and from we extends things doesnt have anyknowledge
        //for salmon




    }
}
