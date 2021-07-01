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
        employees.add(new Employee(1, "Nhat", "1997", "Nam", "098323838", "0978283122", "khong biet", "Giam doc","2000","pro"));

    }
    String[] qualificationArr = {"University", "College", "Intermediate", "Postgraduate"};
    String[] positionArr = {"Le Tan","Phuc vu","Chuyen vien","Giam sat","Quan ly","Giam doc"};



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
        boolean check = false;
        int index = 0;
        int id = Integer.parseInt(inputOutput("Nhap ID ban muon chinh sua"));
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                check = true;
                index = i;
            }
        }
        if (!check) {
            System.out.println("Khong tim duoc ID ban muon chinh sua");
        } else {
            System.out.println("Moi ban chon muc chinh sua");

            System.out.println("1: Chinh sua ngay sinh");
            System.out.println("2: Chinh sua gioi tinh");
            System.out.println("3: Chinh sua CMND");
            System.out.println("4: Chinh sua So dien thoai");
            System.out.println("5: Chinh sua emaill");
            System.out.println("6: Chinh sua trinh do");
            System.out.println("7: Chinh sua muc luong");
            System.out.println("8: Chinh sua chuc vu");
            System.out.println("9: Quay lai");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String newBirthday = inputOutput("Nhap ngay sinh ban muon chinh sua");
                    employees.get(index).setBirthDay(newBirthday);
                    break;
                case 2:
                    String newGender = inputOutput("Nhap gioi tinh ban muon chinh sua");
                    employees.get(index).setGender(newGender);
                    break;
                case 3:
                    String newCMND = inputOutput("Nhap CMND ban muon chinh sua");
                    employees.get(index).setcMND(newCMND);
                    break;
                case 4:
                    String newNumberPhone = inputOutput("Nhap so dien thoai ban muon chinh sua");
                    employees.get(index).setNumberPhone(newNumberPhone);
                case 5:
                    String newEmail = inputOutput("Nhap email ban muon chinh sua");
                    employees.get(index).seteMail(newEmail);
                case 6:
                    System.out.println("Moi ban chon level nhan vien");
                    for (int i = 0; i < qualificationArr.length; i++) {
                        System.out.println(i + " " + qualificationArr[i]);
                    }
                    String qualification = "";
                    boolean isTrue = false;
                    while (!isTrue) {
                        int choiceQual = Integer.parseInt(inputOutput("Moi nhap level ban muon chon"));
                        switch (choiceQual) {
                            case 0:
                                qualification = qualificationArr[0];
                                isTrue = true;
                                break;
                            case 1:
                                qualification = qualificationArr[1];
                                isTrue = true;
                                break;
                            case 2:
                                qualification = qualificationArr[2];
                                isTrue = true;
                                break;
                            case 3:
                                qualification = qualificationArr[3];
                                isTrue = true;
                                break;
                            default:
                                System.out.println("level khong co trong muc chon , moi ban nhap lai");
                        }
                    }
                    break;
                case 7:
                    String newSalary = inputOutput("Nhap muc luong ban muon thay doi");
                    employees.get(index).setSalary(newSalary);
                    break;
                case 8:
                    System.out.println("Moi ban chon chuc vi nhan vien");
                    for (int i = 0; i < positionArr.length; i++) {
                        System.out.println(i + " " + positionArr[i]);
                    }
                    String popSition = "";
                    boolean isTrue2 = false;
                    while (!isTrue2) {
                        int choicePopsition = Integer.parseInt(inputOutput("Moi nhap level ban muon thay doi"));
                        switch (choicePopsition) {
                            case 0:
                                popSition = positionArr[0];
                                isTrue2 = true;
                                break;
                            case 1:
                                popSition = positionArr[1];
                                isTrue2 = true;
                                break;
                            case 2:
                                popSition = positionArr[2];
                                isTrue2 = true;
                                break;
                            case 3:
                                popSition = positionArr[3];
                                isTrue2 = true;
                                break;
                            case 4:
                                popSition = positionArr[4];
                                isTrue2 = true;
                                break;
                            case 5:
                                popSition = positionArr[5];
                                isTrue2 = true;
                                break;
                            default:
                                System.out.println("level khong co trong muc chon , moi ban nhap lai");
                        }
                    }
                    employees.get(index).setPosition(popSition);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Khong co trong menu , moi ban chon lai");
                    break;
            }

        }

    }


    public void addEmployee() {
        int id = Integer.parseInt(inputOutput("Nhap ID ban muon them vao"));
        String name = inputOutput("Nhap ten ban myon them vao");
        String birthDay = inputOutput("Nhap ngay sinh ban muon them vao");
        String genDer = inputOutput("Nhap gioi tinh ban muon them vao");
        String CMND = inputOutput("Nhap CMND ban muon them vao");
        String numberPhone = inputOutput("Nhap so dien thoai ban muon them vao");
        String email = inputOutput("Nhap email ban muon them vao");
        String Salary = inputOutput("Nhap muc luong ban muon them vao");

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
                    break;
            }
        }
        for (int i = 0; i<positionArr.length;i++) {
            System.out.println(i+" "+positionArr[i]);
        }

        String popSition = "";
        boolean isTrue2 = false;
        while (!isTrue2) {
            int choicePopsition=  Integer.parseInt(inputOutput("Moi nhap cap bac ban muon them vao"));
            switch (choicePopsition) {

                case 0:
                    popSition = positionArr[0];
                    isTrue2 = true;
                    break;
                case 1:
                    popSition = positionArr[1];
                    isTrue2 = true;
                    break;
                case 2:
                    popSition = positionArr[2];
                    isTrue2 = true;
                    break;
                case 3:
                    popSition = positionArr[3];
                    isTrue2 = true;
                    break;
                case 4:
                    popSition = positionArr[4];
                    isTrue2 = true;
                    break;
                case 5:
                    popSition = positionArr[5];
                    isTrue2 = true;
                    break;
                default:
                    System.out.println("level khong co trong muc chon , moi ban nhap lai");
                    break;
            }
        }

        Employee employee = new Employee(id,name,birthDay,genDer,CMND,numberPhone,email,popSition,Salary,qualification);
        save(employee);
        System.out.println("Successful!");

    }
}
