package SeminarThree.HomeWork.Service;

import SeminarThree.HomeWork.Model.DataBase;
import java.util.ArrayList;
import java.util.List;


public class DataBaseService implements DataService{
private List<DataBase> baseList = new ArrayList<>();
    @Override
    public void create(List<String> base) {
        VerificationData verificationData = new VerificationDataBase();
        DataBase dataBase = new DataBase(
                verificationData.isFullName(base),
                verificationData.isDateBirth(base),
                verificationData.isPhoneNumber(base),
                verificationData.isSex(base)
        );
        baseList.add(dataBase);
    }

    @Override
    public List<DataBase> read() {
    return baseList;
    }
}
