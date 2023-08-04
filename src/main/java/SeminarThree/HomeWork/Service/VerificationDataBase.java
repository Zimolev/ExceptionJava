package SeminarThree.HomeWork.Service;

import SeminarThree.HomeWork.MyException.*;

import java.util.List;

public class VerificationDataBase implements VerificationData {

    @Override
    public String isFullName(List<String> str) {
        String FIO = "";
        int count = 0;
        for (String word : str) {
            if (Character.isUpperCase(word.charAt(0))) {
                FIO = FIO + word + " ";
                count++;
            }
        }
        if (count != 3) {
            throw new MyIsFullNameException(count);
        }
        return FIO.substring(0, FIO.length() - 1);
    }

    @Override
    public String isDateBirth(List<String> str) {
        String dateBirth = null;
        int count = 0;
        for (String word : str) {
            if (word.matches("\\d{2}.\\d{2}.\\d{4}")) {
                dateBirth = word;
                count++;
            }
        }
        if (count != 1) throw new MyIsDateBirthException();
        return dateBirth;
    }

    @Override
    public Long isPhoneNumber(List<String> str) {
        Long phoneNumber = 0L;
        int count = 0;
        for (String word : str) {
            if (word.matches("[0-9]+")) {
                phoneNumber = Long.parseLong(word);
                count++;
            }
        }
        if (count != 1) throw new MyIsPhoneNumberException();
        return phoneNumber;
    }

    @Override
    public char isSex(List<String> str) {
        char sex = 0;
        int count = 0;
        for (String word : str) {
            if (word.length() == 1 && word.matches("[f, m]+")) {
                sex = word.charAt(0);
                count++;
            }
        }
        if (count != 1) throw new MyIsSexException();
        return sex;
    }

}
