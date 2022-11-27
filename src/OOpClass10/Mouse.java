package OOpClass10;

public class Mouse {
    String brand;
    String color;
    boolean isWireless;
    boolean hasScrollWheel;

    public Mouse(String brand, String color, boolean isWireless, boolean hasScrollWheel) {
        this.brand = brand;
        this.color = color;
        this.isWireless = isWireless;
        this.hasScrollWheel = hasScrollWheel;
    }

    void leftClick() {
        System.out.println("left button click");

    }

    void rightClick() {
        System.out.println("Right button click");

    }

    void scrollUp() {

        System.out.println("scrolling Up");

    }

    void scrollDown() {
        System.out.println("scrolling down");

    }


}
