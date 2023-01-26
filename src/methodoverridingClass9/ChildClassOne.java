package methodoverridingClass9;

public class ChildClassOne extends ParentClass{
    void method(){
        super.method();/*we use super to call parent class methode because it extend child this case we
       // have already overried but if we want to print method parent too*/
        super.method2();
        System.out.println("this is child one method");

    }

}
;/*overriding cause we have the same methode in parent
        class and childclassone evrything is the same*/