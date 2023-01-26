package javamentoring;

public class Overloading {

    int one;
    double two;
    int three;
    String name;


    public void Overloading(int one){
        System.out.println(one);
    }

    public void Overloading(int one,int three){
        System.out.println(one+three);
    }

    public void Overloading(int one,int three,String name){
        System.out.println(one+three+"anna");
    }


    public void methode1(int one,int three,String name){
        System.out.println(one+three+"anna");
    }


}
