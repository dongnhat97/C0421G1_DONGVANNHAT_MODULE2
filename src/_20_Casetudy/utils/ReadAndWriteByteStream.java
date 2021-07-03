package _20_Casetudy.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteByteStream<T> implements InterFaceByteStream {
    @Override
    public List<T> readFileByteStream(File path) {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
    }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Data null "+e);
        }
        return list;

    }

    @Override
    public void writeFileByteStream(List list, File path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void clearData(File path) {
        try {
             FileOutputStream outputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
             objectOutputStream.writeObject(objectOutputStream);
             objectOutputStream.close();
              outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
