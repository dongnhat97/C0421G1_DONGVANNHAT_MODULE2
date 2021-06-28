package _0_BaitapAnhtrung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentIpl implements StudentTtf {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students;
    static {
        students = new ArrayList<>();
        students.add(new Student(1,"Nhat",18, "Ha Tinh" ));
        students.add(new Student(2,"Tai",28, "Da NAng" ));
        students.add(new Student(3,"Diep",38, "Qaung Binh"));
        students.add(new Student(4,"Ha",38, "Kon Tum"));
        students.add(new Student(5,"Ha",28, "Quang Nam"));

    }

    @Override
    public List<Student> sortByName(String name) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student getByID(int id) {
        Student student = null;
        for (Student student1: students) {
            if (student1.getId() == id) {
                student = student1;
            }
        }
        return student;
    }

    @Override
    public void save(Student student) {
         students.add(student);
    }

    @Override
    public void deleteByID(int id) {
//        Student student1 = null;
//        for (Student student: students) {
//            if (student.getId()==id) {
//                student1=student;
//            }
//        }
//        students.remove(student1);
        for (int i = 0 ; i<students.size();i++) {
            if (id == students.get(i).getId()) {
                students.remove(students.get(i));
            }
        }
    }
    public void deleteStudent(){
        int id = Integer.parseInt(inputOutput("moi ban nhap ID student ban muon xoa"));
        this.deleteByID(id);

    }
    private  String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }
    public void createNewStudent()  {
    System.out.println("Nhập id cho cho sinh viên mới: ");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhập tên cho sinh viên mới");
    String name = scanner.nextLine();
    System.out.println("Nhập tuổi cho cho sinh viên mới: ");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhập address cho sinh viên mới");
    String address = scanner.nextLine();
    Student newStudent = new Student(id, name, age, address);
    this.save(newStudent);
    }
    public void displayListStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
    public void editStudent() {
        Student student = null;
        int id = Integer.parseInt(inputOutput("nhap id ban muon edit"));
        int newID = Integer.parseInt(inputOutput("nhap id moi"));
        String newName = inputOutput("nhap ten moi");
        int newAge = Integer.parseInt(inputOutput("nhap tuoi moi"));
        String newAddress = inputOutput("nhap dia chi moi");
        for (Student student1: students) {
            if (id==student1.getId()){
                student = student1;
            }
        }
        student.setAddress(newAddress);
        student.setId(newID);
        student.setName(newName);
        student.setAge(newAge);
    }
}
