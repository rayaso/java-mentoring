package ObjectOrientedPrograming.CompositionClass10;

public class BuyADesktopComputer {
    public static void main(String[] args) {
        KeyBoard dellKeyboard=new KeyBoard("Dell",true,true);


        Mouse hpMouse=new Mouse("hp","black",true,true);

        Monitor asusMonitor=new Monitor("asus","4k",27);
        Monitor dellMonitor=new Monitor("dell","4k",27,true);

        /*we can find those variable all
        inside cause we have already passe them as parameters in monitor class methode*/

        Computer computer=new Computer(dellKeyboard,hpMouse,asusMonitor);

        computer.Keyboard.typingWithKeyBoard();

        /* calling the computer class
         with its methodes because
        to buy a computer we need acess to computer class wish has methods*/

    computer.Mouse.leftClick();
    computer.monitor.turnOn();
    computer.monitor.turnOffComputer();
computer.Mouse.leftClick();







    }



}
