package ObjectOrientedPrograming.CompositionClass10;

public class CompositionLearning {
    /*int x=10;
    String s="hello";*/

    public static void main(String[] args) {
       KeyBoard logical=new KeyBoard("logical",true,true)

               /*parameter usually it is
       ansewer for alreary declared variable we have just to tape the answer*/;/*we have all parameters
       delared inside in one time as a bloc because in keyboard class we created a constractor as a bloc
       for them*/


        KeyBoard dell=new KeyBoard("dell",false,true);

        /*this is another exemple
        it is another object if we need to buy another computer.all the parameters are here as bloc
        because we already set it as a bloc (we created a constractor)in thier class */


        Mouse appleMouse=new Mouse("appel","silver",true,false);


        /* for our project computer that we want to build
        we use logical and applemouse as parameters (this is an object)
        they are allready built they have thier attribus
        this is composition
        a computer is an object tha is composed of other object(mouse,keyboard)*/


        Monitor myMonitor=new Monitor("samsung","samsung",25);    }}