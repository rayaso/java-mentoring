package OOpClass10;

public class SingleTonClass {
   /* void  one(){
        System.out.println("hello");
    }
*/
int x=50;
static SingleTonClass obj=new SingleTonClass();//this is like creating a variable(int x=10)
private SingleTonClass(){

}
public static SingleTonClass getInstance(int x){
    return obj;
}

}
