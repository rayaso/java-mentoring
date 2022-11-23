package SorayaQuiz;

public class Switch {
    public static void main(String[] args) {
        int n = 5;
        switch (n) {
            case 1:
                System.out.println("=10");
                break;
            case 3:
                System.out.println("=3");
                break;
            case 5:
                System.out.println("=we have reached number 5");
                break;
            case 6:
                System.out.println("we have not reached number 5");
                break;
            default:
                System.out.println("non of the above");
        }
    }
}
