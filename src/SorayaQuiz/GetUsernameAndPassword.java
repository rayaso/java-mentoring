package SorayaQuiz;

public class GetUsernameAndPassword {
    public static void main(String[] args) {
        EncapsulationUsernameAndPassword obj=new EncapsulationUsernameAndPassword();
        obj.setSsn(5568548);
        System.out.println(obj.getSsn());
        obj.setAcc(13689452);
        System.out.println(obj.getAcc());

    }
}
