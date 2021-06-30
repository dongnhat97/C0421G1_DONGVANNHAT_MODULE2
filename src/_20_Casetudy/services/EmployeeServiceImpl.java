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
        employees.add(new Employee(1, "18/8/1993", "Female", 37379293, "098323838", "hihi@gmaill", "khong biet", 200,"pro"));

    }
    String[] qualificationArr = {"University", "College", "Intermediate", "Postgraduate"};



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

    @Override
    public void editEmployeeService() {
        Employee employee = null;

        int id = Integer.parseInt(inputOutput("Nhap ID ban muon chinh sua"));
        String newBirthday = inputOutput("Nhap ngay sinh ban muon chinh sua");
        String newGender = inputOutput("Nhap gioi tinh ban muon chinh sua");
        int newCMND = Integer.parseInt(inputOutput("Nhap CMND ban muon chinh sua"));
        String newNumberPhone = inputOutput("Nhap so dien thoai ban muon chinh sua");
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
        String numberPhone = inputOutput("Nhap so dien thoai ban muon them vao");
        String email = inputOutput("Nhap email ban muon them vao");
        String level = inputOutput("Nhap level ban muon them vao");
        int Salary = Integer.parseInt(inputOutput("Nhap muc luong ban muon them vao"));
        String position = inputOutput("Chuc vu ban muon them vao");
        for (int i = 0; i < qualificationArr.length; i++) {
            System.out.println(i + ") " + qualificationArr[i]);
        }
        String qualification = "";
        boolean isTrue = false;
        while (!isTrue) {
            int choiceQual = Integer.parseInt(inputOutput("Nhap trinh do ban mon lua chon"));
            switch (choiceQual) {
                case 0:
                    isTrue = true;
                    qualification = qualificationArr[0];
                    break;
                case 1:
                    isTrue = true;
                    qualification = qualificationArr[1];
                    break;
                case 2:
                    isTrue = true;
                    qualification = qualificationArr[2];
                    break;
                case 3:
                    isTrue = true;
                    qualification = qualificationArr[3];
                    break;
                default:
                    System.err.println("Input qualification false. Please retry.");
            }
        }

        Employee employee = new Employee(id,birthDay,genDer,CMND,numberPhone,email,position,Salary,qualification);
        save(employee);
    }
}
