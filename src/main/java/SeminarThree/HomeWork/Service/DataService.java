package SeminarThree.HomeWork.Service;


import SeminarThree.HomeWork.Model.DataBase;

import java.util.List;

public interface DataService {
    void create(List<String> base);

    List<DataBase> read();

}
