package sorayaDressProjectClass10;

public class Shoes {
    int size;
    int footLength;
    boolean isItTrueToSize;
    int heelHigh;

    public Shoes(int size,int footLength,boolean isItTrueToSize){
        this.size=size;
        this.footLength=footLength;
        this.isItTrueToSize=isItTrueToSize;}
    public Shoes(int size,int footLength,boolean isItTrueToSize,int heelHigh){
        //iam overloading thid methode by adding parameter heelhigh
        this.size=size;
        this.heelHigh=heelHigh;
        this.footLength=footLength;
        this.isItTrueToSize=isItTrueToSize;

    }



    void wearingShoes(){
        System.out.println("wear shoes");
    }
void stopWearingShoes(){
    System.out.println("do not wear shoes");
}

}