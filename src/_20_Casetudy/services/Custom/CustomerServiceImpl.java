package _20_Casetudy.services.Custom;

import _20_Casetudy.libs.Choice;
import _20_Casetudy.libs.ValidateData;
import _20_Casetudy.models.Customer;
import _20_Casetudy.utils.ReadAndWriteByteStream;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
     private static ReadAndWriteByteStream<Customer> readAndWriteByteStream = new ReadAndWriteByteStream<>();
     private static File file = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\Customer.csv");
     private static Scanner scanner = new Scanner(System.in);
     static List<Customer> customers = new LinkedList<>();

//     static {
//        customers.add(new Customer(1, "Nhat", "1997", "Nam", "0982363617", "hellomoto@gmail.com", "Vip", "Vip","HaNoi"));
//        readAndWriteByteStream.writeFileByteStream(customers,file);
//    }
        String [] classifyArr = {"(Diamond,","Platinium,","Gold","Silver","Member"};

    @Override
    public List<Customer> getAll() {
        customers = readAndWriteByteStream.readFileByteStream(file);
        return customers;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void showInfo() {
        getAll();
        for (Customer customer: customers) {
            if (customer!=null) {
                System.out.println(customer);
            }else {
                System.out.println("Chua co danh sach trong menu , moi ban them vao");
            }
        }

    }
    private String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.next();
        return output;
    }

    @Override
    public void editCustomService() {
        boolean check = false;
        int index = 0;
        int id = Integer.parseInt(inputOutput("Nhap ID ban muon chinh sua"));
        for (int i = 0; i < customers.size(); i++) {
            if (id == customers.get(i).getId()) {
                check = true;
                index = i;
                break;
            }
        }
        if (!check) {
            System.out.println("ID ban nhap khong dung");
        } else {
            System.out.println("Moi ban nhap chuc nang muon chinh sua");
            System.out.println("1:Chinh sua ngay sinh");
            System.out.println("2:Chinh sua gioi tinh");
            System.out.println("3:Chinh sua CMND");
            System.out.println("4:Chinh sua so dien thoai");
            System.out.println("5:Chinh sua gmaill");
            System.out.println("6:Nhap phan loai ban muon chinh sua");
            System.out.println("7:Nhap dia chi ban muon chinh sua");
            System.out.println("0: Quay lai");
            boolean check2 = false;
            while (!check2) {
                int choiceCustom = Choice.choiceMenu();
                switch (choiceCustom) {
                    case 1:
                        String newBirthday = ValidateData.dateOfBirth();
                        customers.get(index).setBirthday(newBirthday);
                        check2 = true;
                        break;
                    case 2:
                        String newMale = Choice.outputStringRegex("Nhập gipứo tính thay thế");
                        customers.get(index).setGender(newMale);
                        check2 = true;
                        break;
                    case 3:
                        String newCMND = Choice.outputStringRegex("Nhap CMND moi");
                        customers.get(index).setIdentityCard(newCMND);
                        check2 = true;
                        break;
                    case 4:
                        String newNumberPhone = Choice.outputStringRegex("Nhap so dien thoai moi");
                        customers.get(index).setNumberPhone(newNumberPhone);
                        check2 = true;
                        break;
                    case 5:
                        String newEmail = Choice.outputStringRegex("Nhap emaill moi");
                        customers.get(index).setEmail(newEmail);
                        check2 = true;
                        break;
                    case 6:
                        boolean check3 = false;
                        String classity = "";
                        while (!check3) {
                            for (int i = 0; i < classifyArr.length; i++) {
                                System.out.println(i + " " + classifyArr[i]);
                            }
                            int choiceClassify = Choice.choiceMenu();
                            switch (choiceClassify) {
                                case 0:
                                    classity = classifyArr[0];
                                    check3 = true;
                                    break;
                                case 1:
                                    classity = classifyArr[1];
                                    check3 = true;
                                    break;
                                case 2:
                                    classity = classifyArr[2];
                                    check3 = true;
                                    break;
                                case 3:
                                    classity = classifyArr[3];
                                    check3 = true;
                                    break;
                                case 4:
                                    classity = classifyArr[4];
                                    check3 = true;
                                    break;
                            }
                        }
                        customers.get(index).setClassify(classity);
                        break;
                    case 7:
                        String newAddress = inputOutput("Nhap dia chi moi");
                        customers.get(index).setAddress(newAddress);
                        check2 = true;
                        break;
                    case 0:
                        return;

                    default:
                        System.out.println("Khong co trong me nu chinh sua , vui long nhap lai");
                        break;
                }
            }
        }
        readAndWriteByteStream.clearData(file);
        readAndWriteByteStream.writeFileByteStream(customers,file);
    }
    public void addCustomService() {
        boolean check = false;
        int count = 0;
        int id = 0;
        while (!check) {
            id = Choice.choiceMenuMini("Nhập ID thêm mới");
            for (Customer element: customers) {
                if (id!=element.getId()) {
                    count++;
                }
            }
            if (count==customers.size()) {
                check = true;
            }else {
                System.out.println("Trùng ID rồi , mời bạn nhập lại");
            }

        }
        String name = Choice.outputStringRegex("Nhập tên bạn muốn thêm vào ");
        String birthDay = ValidateData.dateOfBirth();
        String gender = inputOutput("Nhap gioi tinh ban muon them vao");
        String CMND = inputOutput("Nhap CMND ban muon them vao");
        String numberPhone = inputOutput("Nhap so dien thoai ban muon them vao");
        String email = inputOutput("Nhap email ban muon them vao");
        String address = inputOutput("Nhap dia chi ban muon them vao");
        for (int i = 0 ; i< classifyArr.length;i++) {
            System.out.println(i+" "+classifyArr[i]);
        }
        String newClassify = "";
        boolean isTrue2 = false;
        while (!isTrue2) {
            int choicePopsition=  Choice.choiceMenu();
            switch (choicePopsition) {
                case 0:
                    newClassify = classifyArr[0];
                    isTrue2 = true;
                    break;
                case 1:
                    newClassify = classifyArr[1];
                    isTrue2 = true;
                    break;
                case 2:
                    newClassify = classifyArr[2];
                    isTrue2 = true;
                    break;
                case 3:
                    newClassify = classifyArr[3];
                    isTrue2 = true;
                    break;
                case 4:
                    newClassify = classifyArr[4];
                    isTrue2 = true;
                    break;
                default:
                    System.out.println("level khong co trong muc chon , moi ban nhap lai");
                    break;
            }
        }
        Customer customer = new Customer(id,name,birthDay,gender,CMND,numberPhone,email,newClassify,address);
        save(customer);
        readAndWriteByteStream.writeFileByteStream(customers,file);
        System.out.println("Successful!");
    }
}