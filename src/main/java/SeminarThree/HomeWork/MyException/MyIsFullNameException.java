package SeminarThree.HomeWork.MyException;

public class MyIsFullNameException extends RuntimeException{
    public MyIsFullNameException(int i){
        super("Не верное количество слов (" + i + "," + "ФИО сотоит из трех)");
    }
}
