package OOpClass10;

public class SingleTonClass {//singleton is object hidden
   /* void  one(){
        System.out.println("hello");
    }
*/

    /*to create a singlton class we have to follow thes steps:
    -make object private
    -setter
   -getter
     */
int x=50;
static SingleTonClass obj=new SingleTonClass();//this is like creating a variable(int x=10),setter
private SingleTonClass(){

}
public static SingleTonClass getInstance(int x){//getter

    return obj;
}

}
