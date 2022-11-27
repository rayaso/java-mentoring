package sorayaDressProjectClass10;

public class NewOutFit {
    public static void main(String[] args) {


        Dress annaDress=new Dress("black","poly",40);/* icreated this object to
        use sorayaoutfit dress attributtes for this newoutfit*/
        Shoes annaShoes=new Shoes(8,20,true);/* i created this object to use
        sorayaoutfit shoes attributes*/
        SorayaOutFit NewOutFit=new SorayaOutFit (annaDress,annaShoes);/* this is the newoutfit that
        i want to add*/

    NewOutFit.shoesSoraya.wearingShoes();
    NewOutFit.dressSoraya.DoNotWearDress();
    NewOutFit.dressSoraya.DressSora();


}}
