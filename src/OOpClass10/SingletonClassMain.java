package OOpClass10;

public class SingletonClassMain {

    public static void main(String[] args) {

        SingleTonClass soraya = SingleTonClass.getInstance(10);/*has red line we can not create obj,
        but when we add (getInstance())*/
      SingleTonClass SONY = SingleTonClass.getInstance(20);
      SingleTonClass CCC=SingleTonClass.getInstance(30);

        System.out.println(soraya.x);
        System.out.println(SONY.x);
        System.out.println(CCC.x);
    }

}
