package SeminarTwo.HomeWork;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(inputNumber());
    }

    public static float inputNumber() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите число: ");
            return input.nextFloat();
        } catch (Exception e) {
            System.out.println("Операция не выполнена.  Неверный формат данных");
            return inputNumber();
        }
    }
}
