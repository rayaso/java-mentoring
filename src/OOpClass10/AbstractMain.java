package OOpClass10;
//this class created to see what is inside abstract class that we have

public class AbstractMain {
    public static void main(String[] args) {
      /*  Abstract soraya=new Abstract() {
            @Override
            void methodeTwo() {

            }
        } we can not create an object for abstract method or calling attributes of class through object
        with abstract class or method we can just extend it to use it*/



        /*we have to create an object here to test abstract cause it inherited abstract class*/

        TestAbstract soraya=new TestAbstract();/*we created an object to access testabstract class
        wich is inheriteded */

        soraya.methodeTwo();/*we are using those methods after making it working in test abstract
        by extendidng the abstract class in testabstract class and creating an object for access in
         this class */


        soraya.userName();/*we are accessing those 2 methods from abstract class even
          it is abstract class so by creating an object
        for inherited abstract class that is testAbstract class*/

    }
}
