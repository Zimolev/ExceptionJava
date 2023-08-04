package SeminarThree.HomeWork.Controller;

import SeminarThree.HomeWork.Model.DataBase;
import SeminarThree.HomeWork.Service.DataBaseService;
import SeminarThree.HomeWork.Service.LogsFiles;
import SeminarThree.HomeWork.View.BaseDataView;

import java.io.File;
import java.util.List;


public class Controller {
    private final DataBaseService dataBaseService = new DataBaseService();
    private final BaseDataView baseDataView = new BaseDataView();
    private final LogsFiles logsFiles = new LogsFiles();

    public void createDataBase() {
      dataBaseService.create(baseDataView.getBaseDataView());
    }
    public void read(){
        dataBaseService.read();
    }

    public void importFile() {
        logsFiles.setFile(dataBaseService.read());
    }
    public void loadFile(){
        logsFiles.loadFile(logsFiles.getFile());
    }


}
