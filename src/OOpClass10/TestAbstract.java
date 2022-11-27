package OOpClass10;


//we are calling abstract class(abstract)from concrete class(testAbstract)
//so we have to implement abstract methode in the abstract class
//or declare concrete class as abstract class
public class TestAbstract extends Abstract{
    @Override
    void methodeTwo() {//overriding abstract method in other class is a must to use abstract class
        //and abstract methode cause here we have curly braces so we can use it now wish is not
        //the same when it was in abstract method in abstract  class
        System.out.println("hello");

    }
    void userName(){
        System.out.println("print my user name");/*here in this class we are making those methods work
        by extending class because before they are in abstract class that is did not have curly
    braces to pass parameter and make it work*/

    }

}
