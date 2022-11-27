package encapsulation;

public class GettersAndSetters {

    private int acc;
    private int pass;

    public void setAcc(int acc){//when we do not have a return type or sout methode we have
        this.acc=acc;

    }

    public int getAcc(){//we do not need to pass parameters when we have a return type
        return acc;

    }

    public static void main(String[] args) {
        GettersAndSetters obj=new GettersAndSetters();
    }








}
