package SeminarThree.HomeWork.Model;
/**
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * дата рождения - строка формата dd.mm.yyyy
 * номер телефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 * */
public class DataBase {
    private String FIO;
    private String dateBirth;
    private Long numberPhone;
    private char sex;

    public DataBase(String FIO, String dateBirth, Long numberPhone, char sex) {
        this.FIO = FIO;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
        this.sex = sex;
    }

    public DataBase() {
    }

    public String getFIO() {
        return FIO;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public Long getNumberPhone() {
        return numberPhone;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "FIO='" + FIO + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", numberPhone=" + numberPhone +
                ", sex=" + sex +
                '}';
    }
}
