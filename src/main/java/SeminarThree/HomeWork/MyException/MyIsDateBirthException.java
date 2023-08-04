package SeminarThree.HomeWork.MyException;

public class MyIsDateBirthException extends RuntimeException{
    public MyIsDateBirthException(){
        super("Не верный формат даты рождения");
    }
}
