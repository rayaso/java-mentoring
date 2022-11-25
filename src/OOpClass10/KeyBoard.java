package ObjectOrientedPrograming.CompositionClass10;

public class KeyBoard {//this is composition we creared our own datatype
    String brand;
    boolean isWireless;
    boolean hasNumpad;
    public KeyBoard(String brand, boolean isWireless, boolean hasNumpad){/*this is a constractor
    we need to create it because when we call those parameters in other class
    we will call it as bloc not evryparametters one by one */

        this.brand=brand;
        this.isWireless=isWireless;
        this.hasNumpad=hasNumpad;
    }

    void typingWithKeyBoard(){
        System.out.println("started typing");

    }

    void turnOncapslock(){
        System.out.println("caps lock on,we are typing all in capital");

    }

    void turnOffCapsLock(){
        System.out.println("caps lock turned off,we are typing all in lower case");
    }
}
