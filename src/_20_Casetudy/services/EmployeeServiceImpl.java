package _20_Casetudy.services;

import _20_Casetudy.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
//    Array List
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(1,"18/8/1993","Female",285623986,192567894,"Ngocxinhgai@gmaill.com","Good","Nhom Truong",2000));
        employees.add(new Employee(2,"28/08/1997","Male",255346221,236584723,"NhatDV@gmaill.com","Very Good","Quan ly",5000));
        employees.add(new Employee(3,"25/5/1990","Male",111346221,113113223,"Diep@gmaill.com","Good","Le tan",500));
    }




    @Override
    public void showInfo() {
       for (Employee employee: employees) {
           if (employee!=null) {
               System.out.println(employee);
           }
       }
    }

    @Override
    public void save(Employee employee) {
       employees.add(employee);
    }
    private  String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }
    public void editEmployee() {
        Employee employee = null;

       int id = Integer.parseInt(inputOutput("Nhap ID ban muon chinh sua"));
       String newBirthday = inputOutput("Nhap ngay sinh ban muon chinh sua");
       String newGender = inputOutput("Nhap gioi tinh ban muon chinh sua");
       int newCMND = Integer.parseInt(inputOutput("Nhap CMND ban muon chinh sua"));
       int newNumberPhone = Integer.parseInt(inputOutput("Nhap so dien thoai ban muon chinh sua"));
       String newEmail = inputOutput("Nhap email ban muon chinh sua");
       String newLevel = inputOutput("Nhap level ban muon chinh sua");
       int newSalary = Integer.parseInt(inputOutput("Nhap muc luong ban muon thay doi"));
       String newPosition = inputOutput("Chuc vu ban muon thay doi");
       for (Employee employee1: employees) {
           if (id==employee1.getId()) {
               employee= employee1;
           }
       }

        employee.setBirthDay(newBirthday);
       employee.setLevel(newLevel);
       employee.setSalary(newSalary);
       employee.setPosition(newPosition);
       employee.setcMND(newCMND);
       employee.seteMail(newEmail);
       employee.setNumberPhone(newNumberPhone);

    }
    public void addEmployee() {
        int id = Integer.parseInt(inputOutput("Nhap ID ban muon them vao"));
        String birthDay = inputOutput("Nhap ngay sinh ban muon them vao");
        String genDer = inputOutput("Nhap gioi tinh ban muon them vao");
        int CMND = Integer.parseInt(inputOutput("Nhap CMND ban muon them vao"));
        int nmberPhone = Integer.parseInt(inputOutput("Nhap so dien thoai ban muon them vao"));
        String email = inputOutput("Nhap email ban muon them vao");
        String level = inputOutput("Nhap level ban muon them vao");
        int Salary = Integer.parseInt(inputOutput("Nhap muc luong ban muon them vao"));
        String position = inputOutput("Chuc vu ban muon them vao");
        Employee employee = new Employee(id,birthDay,genDer,CMND,nmberPhone,email,level,position,Salary);
        save(employee);
    }
}
