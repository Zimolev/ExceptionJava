package SeminarThree.HomeWork;

import SeminarThree.HomeWork.Controller.Controller;
import SeminarThree.HomeWork.Model.DataBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createDataBase();
        controller.importFile();
        //controller.loadFile();
    }
}
