package OOpClass10;

public abstract class Abstract {//this is a concrete class if no key word abstract
    //to use abstract class it needs to be inherited from another class



    //this is a concrete methode

    void methodeOne() {/*any methode without abstract key word and if it has curely bracess even without
    code inside(code block) is a concrete method*/
        System.out.println("hello");
    }


//this is abstract methode
    //if we have an abstract methode that class must to be declared abstract class
    /*abstract methode is with key word abstract and do not have any code block/curly braces
 abstract*/

     abstract  void methodeTwo();//does not  have curly braces cause it is abstracted
    //i can not run this method because is it abstract does not have curly braces that is whey
    //need to be extended to another to use it

    abstract  void userName();/*here in thid class we are making those methods work because before
    they are in abstract class that is did not have curly braces to pass parameter and make it work



    to make methods works from abstract class we have to extend this class and than  create object
    for this extended class and than we can call those methods so run it*/






}
