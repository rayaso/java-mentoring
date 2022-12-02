 package javaclass11;

public class MainClassInterface implements MyInterface2 {

    //next step is right click and chose generate and
        //chose implements methods,in interface this is the way to implements method and we have too
        //in interface we have to implements methods




    @Override
    public void myMethod() {
        System.out.println(1);
    }

    @Override
    public void myMethod2() {
        System.out.println(3);

    }

    @Override
    public void myM3() {
        System.out.println(5);

    }

    @Override
    public void myM4() {
        System.out.println(55);

    }

    public static void main(String[] args) {
        MainClassInterface soraya=new MainClassInterface();
    }




}
