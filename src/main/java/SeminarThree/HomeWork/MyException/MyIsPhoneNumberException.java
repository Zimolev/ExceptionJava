package SeminarThree.HomeWork.MyException;

public class MyIsPhoneNumberException  extends RuntimeException{
    public MyIsPhoneNumberException(){
        super("Не верный формат номера телефона");
    }
}
