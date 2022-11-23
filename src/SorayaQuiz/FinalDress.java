package SorayaQuiz;

public class FinalDress {
    final int size = 38;
    int weight = 100;


    public static void main(String[] args) {
        FinalDress s = new FinalDress();
        s.weight = 200;
        // s.size = 40;//we can not have access to size because it is final datatype.
        System.out.println(s.weight);
        System.out.println(s.size);
    }
}






