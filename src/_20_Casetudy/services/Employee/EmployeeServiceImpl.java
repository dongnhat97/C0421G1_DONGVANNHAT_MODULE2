package _20_Casetudy.services.Employee;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.libs.ValidateData;
import _20_Casetudy.models.Employee;
import _20_Casetudy.utils.ReadAndWriteByteStream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
//    Array List
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();
    private static final File file = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\Employee.csv");
    private static final ReadAndWriteByteStream<Employee> readAndWriteByteStream = new ReadAndWriteByteStream<>();
    static {

        employees.add(new Employee(1, "Nhat", "1997", "Nam", "098323838", "0978283122", "khong biet", "Giam doc","2000","pro"));
//        readAndWriteByteStream.writeFileByteStream(employees,file);

    }
    String[] qualificationArr = {"University", "College", "Intermediate", "Postgraduate"};
    String[] positionArr = {"Le Tan","Phuc vu","Chuyen vien","Giam sat","Quan ly","Giam doc"};

    @Override
    public List getAll() {
      employees = readAndWriteByteStream.readFileByteStream(file);
        return employees;
    }

    @Override
    public void showInfo() {
        getAll();
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
    public  String inputOutput(String message) {
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
            System.out.println("1: Chỉnh sửa tên");
            System.out.println("2: Chinh sua ngay sinh");
            System.out.println("3: Chinh sua gioi tinh");
            System.out.println("4: Chinh sua CMND");
            System.out.println("5: Chinh sua So dien thoai");
            System.out.println("6: Chinh sua emaill");
            System.out.println("7: Chinh sua trinh do");
            System.out.println("8: Chinh sua muc luong");
            System.out.println("9: Chinh sua chuc vu");
            System.out.println("0: Quay lai");
            int choice = Choice.choiceMenu();
            switch (choice) {
                case 1:
                    String newBirthday = Choice.outputStringRegex("Nhap ngay sinh ban muon chinh sua");
                    employees.get(index).setBirthday(newBirthday);
                    break;
                case 2:
                    String newGender = Choice.outputStringRegex("Nhap gioi tinh ban muon chinh sua");
                    employees.get(index).setGender(newGender);
                    break;
                case 3:
                    String newIdentityCard = Choice.outputStringRegex("Nhap CMND ban muon chinh sua");
                    employees.get(index).setIdentityCard(newIdentityCard);
                    break;
                case 4:
                    String newNumberPhone = Choice.outputStringRegex("Nhap so dien thoai ban muon chinh sua");
                    employees.get(index).setNumberPhone(newNumberPhone);
                    break;
                case 5:
                    String newEmail = Choice.outputStringRegex("Nhap email ban muon chinh sua");
                    employees.get(index).setEmail(newEmail);
                    break;
                case 6:
                    System.out.println("Moi ban chon level nhan vien");
                    for (int i = 0; i < qualificationArr.length; i++) {
                        System.out.println(i + " " + qualificationArr[i]);
                    }
                    String qualification = "";
                    boolean isTrue = false;
                    while (!isTrue) {
                        int choiceQual = Choice.choiceMenu();
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
                                System.out.println("bạn nhập chưa đúng fomat, mời bạn nhập lại");
                        }
                    }
                    employees.get(index).setLevel(qualification);
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
                        int choicePopsition = Choice.choiceMenu();
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
                    employees.get(index).setPosition(popSition);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Khong co trong menu , moi ban chon lai");
                    break;
            }

        }
         readAndWriteByteStream.clearData(file);
        readAndWriteByteStream.writeFileByteStream(employees,file);

    }


    public void addEmployee() {
         getAll();
         boolean check = false;
         int count = 0;
         int id = 0;
         while (!check) {
              id = Choice.choiceMenuMini("Nhập ID thêm mới");
             for (Employee element: employees) {
                 if (id!=element.getId()) {
                     count++;
                 }
             }
             if (count==employees.size()) {
                 check = true;
             }else {
                 System.out.println("Trùng ID rồi , mời bạn nhập lại");
             }
         }

        String name = Choice.outputStringRegex("nhap tên bạn muốn thêm vào");
        String birthday = ValidateData.dateOfBirth();
        String gender = Choice.outputStringRegex("Nhập giới tính bạn muốn thêm vào");
        String identityCard = Choice.outputStringRegex("Nhap CMND ban muon them vao");
        String numberPhone = Choice.outputStringRegex("Nhap so dien thoai ban muon them vao");
        String email = ValidateData.emaill();
        String Salary = Choice.outputStringRegex("Nhap muc luong ban muon them vao");
        System.out.println("Them trinh do hoc van");
        for (int i = 0; i < qualificationArr.length; i++) {
            System.out.println(i + ") " + qualificationArr[i]);
        }
        String qualification = "";
        boolean isTrue = false;
        while (!isTrue) {
            int choiceQual = Choice.choiceMenu();
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
            int choicePopsition=  Choice.choiceMenuMini("Moi bạn nhập cấp bậc muốn thêm vào");
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

        employees.add(new Employee(id,name,birthday,gender,identityCard,numberPhone,email,popSition,Salary,qualification)) ;
//        save(employee);
        readAndWriteByteStream.writeFileByteStream(employees,file);
        System.out.println("Successful!");

    }

}
