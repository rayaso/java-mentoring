package OOpClass10;

public class Monitor {
    int size;
    String brand;
    String resolution;
    boolean hasWebcam;

    public  Monitor(String brand,String resolution,int size){ //this is constractor to group all
        // the variabls
        //of monitor in it.
        this.brand=brand;
        this.resolution=resolution;
        this.size=size;}
        void turnOn(){
            System.out.println("turn on monitor");

        }
void turnOffComputer(){
            System.out.println("turn off monitor");
        }


public  Monitor(String brand,String resolution,int size,boolean hasWebcam){ /* this is overloading
by adding parameter(hasWebcam) in case i want somthing new in my monitor*/
    this.brand=brand;
    this.size=size;
    this.resolution=resolution;
    this.hasWebcam=hasWebcam;



}



}
