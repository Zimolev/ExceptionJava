package SeminarThree.HomeWork.Service;

import SeminarThree.HomeWork.Model.DataBase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogsFiles {

    private List filelogs;
    private File file;

    public File getFile() {
        return file;
    }

    public List getFilelogs() {
        return filelogs;
    }

    public LogsFiles() {
    }
    public void setFile(List<DataBase> dataBaseList) {

        StringBuilder sb = new StringBuilder();
        for (DataBase dataBase : dataBaseList) {
            sb.append(dataBase.getFIO());
            sb.append(',');
            sb.append(dataBase.getDateBirth());
            sb.append(',');
            sb.append(dataBase.getNumberPhone());
            sb.append(',');
            sb.append(dataBase.getSex());
            sb.append('\n');
        }
        String name = sb.toString().split(" ")[0];
        file = new File(name + ".txt");
        try {
            FileOutputStream bos = new FileOutputStream(file, true);
            if (!sb.isEmpty()) {
                bos.write((sb.toString().getBytes()));
                bos.write("\n".getBytes());}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFile(File file) {
        filelogs = new ArrayList();
        try (BufferedReader fis = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = fis.readLine()) != null) {
                filelogs.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Object filelog : filelogs) {
            System.out.println("filelog = " + filelog);
        }
    }
}
