package SorayaQuiz;

public class OverLoading {
    int one;
    double two;
    String soraya;


    public double OverLoading(int one, double two) {

        this.one = one;
        this.two = two;
        return one + two;
    }

    public double OverLoading(int one, double two, String soraya) {//overloading by adding parameter
        this.one = one;
        this.two = two;
        this.soraya = soraya;
        System.out.println("soraya");
        return one + two;
    }

    public OverLoading(int one, double two, String soraya) {// BY CHANGING DATAYPE

        System.out.println("soraya");


    }
}
