package readandwrite;

public class TryAndCash {
    public static void main(String[] args) {

        try {
            String[] arr = {"hi", "hello"};
            System.out.println(arr[3]);


        } catch (Exception e) {
            /* System.out.println("something wrong");or we can use tis next*/
            e.getMessage();
            System.out.println(e.getMessage());
        }

    }
}