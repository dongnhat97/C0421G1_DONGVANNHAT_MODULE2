package _18_Serializable.practice;

import _0_BaitapAnhtrung.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", 10,"Ha noi "));
        students.add(new Student(2, "Nguyễn Minh Quân", 15,"c05"));
        writeToFile("C0421G1_DONGVANNHAT_MODULE22\\src\\_18_Serializable\\practice\\Student.csv",students);
        List<Student> studentDataFromFile = readDataFromFile("C0421G1_DONGVANNHAT_MODULE22\\src\\_18_Serializable\\practice\\Student.csv");
        for (Student student: studentDataFromFile) {
            System.out.println(student);
        }
    }
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
