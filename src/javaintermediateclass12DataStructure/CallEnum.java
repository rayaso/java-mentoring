package javaintermediateclass12DataStructure;

public class CallEnum {
    public static void main(String[] args) {
        TestEnum E = TestEnum.MONDAY;
        switch (E){
            case SATURDAY:
                System.out.println("we have class today");
                break;
            case THURSDAY:
                System.out.println("we dont");
                break;

        }

        for (TestEnum D:TestEnum.values()){
            System.out.println(D);
        }
    }



}
