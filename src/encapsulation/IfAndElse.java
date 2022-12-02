package encapsulation;

public class IfAndElse {
    public static void main(String[] args) {
        int x=20;
        int y=10;

        if(x>y){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
       if(x>y){
           System.out.println("x has bigger value");
       }
        else if(y>x){
           System.out.println("y has larger value");
       }

        else if(x==y){
           System.out.println("both has the same value");

       }
        else {//usually should in the end
           System.out.println("wrong");
       }

    }


}




