package HomeWork;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) throws Exception {

        try {
            inputString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            inputString();
        }
    }

    public static void inputString() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String value = input.nextLine();
        if(value == null || value.isEmpty()){
            throw new Exception("Ввод пустой строки не допускается");
        } else {
            System.out.println(value);
        }
    }
}
