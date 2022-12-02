package encapsulation;

public class GettersAndSetters {//hiding datatype and call it through getters and setters

    private int acc;
    private int pass;

    public void setAcc(int acc){//when we do not have a return type or sout methode we have to pass
        //parameters inside the methode
        //when passing parameters ,we have to refer the parameters to variable declared class by using
        //key word this
        //thid methode void is to setacc like it is int in parameters

        this.acc=acc;

    }

    public int getAcc(){//we do not need to pass parameters when we have a return type
        //this method is to get this int after set up it in first method

        return acc;
    }

    public void setPass(int pass){
        this.pass=pass;
    }
    public int getPass() {
        return pass;
    }

    public static void main(String[] args) {//we can create another class and write this code
        //this method is to print the result

        GettersAndSetters obj=new GettersAndSetters();//to access the parameters declared
        obj.setAcc(562658);
        obj.setPass(2003);
        System.out.println(obj.getAcc());
        System.out.println(obj.getPass());
    }

















}
