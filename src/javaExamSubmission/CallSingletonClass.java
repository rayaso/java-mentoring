package javaExamSubmission;

public class CallSingletonClass {
    public static void main(String[] args) {
        SingletonClass a=SingletonClass.getInstance(10);
        SingletonClass P=SingletonClass.getInstance(40);
        SingletonClass L=SingletonClass.getInstance(122);
        SingletonClass G=SingletonClass.getInstance(600);

        System.out.println(a.x);
        System.out.println(P.x);
        System.out.println(L.x);
        System.out.println(G.x);





    }






}
