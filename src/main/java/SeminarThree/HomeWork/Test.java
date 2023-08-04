package SeminarThree.HomeWork;

import SeminarThree.HomeWork.MyException.MyIsPhoneNumberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str = "Зимник Олег Викторович 07041976 89127559446 m";
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        isPhoneNumber(str);
    }
    public static Long isPhoneNumber(String str) {
        List <String> words = new ArrayList<>(List.of(str.split(" ")));
        Long phoneNumber = 0L;
        int count =0;

        for (String word : words) {
            if (word.matches("[0-9]+")) {
                phoneNumber = Long.parseLong(word);
                count++;
                System.out.println(count);
            }
        }
        if (count!=1) throw new MyIsPhoneNumberException();
        return phoneNumber;
    }
}