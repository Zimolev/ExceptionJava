package SeminarThree.HomeWork.MyException;

public class MyAmountDataException extends RuntimeException{
    public MyAmountDataException(int i){
        super("Не верное количество данных (" + i + "," + "должно быть 6)");
    }
}
