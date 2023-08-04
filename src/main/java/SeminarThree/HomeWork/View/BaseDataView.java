package SeminarThree.HomeWork.View;

import SeminarThree.HomeWork.MyException.MyAmountDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseDataView {
    public List<String> getBaseDataView() {
        int count = 6; //по условиям задачи данных должно быть именно столько
        Scanner input = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество, дата рождения, номер телефона, пол)");
        System.out.println("в произвольном порядке, разделенные пробелом (данные вводятся одной строкой без запятых: )");
        String personalData = input.nextLine();
        if (!personalData.isEmpty()) {
            List<String> words = new ArrayList<>(List.of(personalData.split(" ")));
            if (words.size() != count) {
                throw new MyAmountDataException(words.size());
            } else return words;
        } else {
            throw new MyAmountDataException(0);
        }
    }
}