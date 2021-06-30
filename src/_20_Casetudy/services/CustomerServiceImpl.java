package _20_Casetudy.services;

import _20_Casetudy.models.Customer;
import _20_Casetudy.models.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {


    private static Scanner scanner = new Scanner(System.in);

    static List<Customer> customers = new LinkedList<>();

    static {
        customers.add(new Customer(1, "16/6/1985", "Male", 172631932, "0982363617", "hellomoto@gmail.com", "Vip", "HaNoi"));
    }


    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void showInfo() {
        for (Customer customer: customers) {
            if (customer!=null) {
                System.out.println(customer);
            }
        }

    }
    private  String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }

    @Override
    public void editCustomService() {
        Customer customer1 = null;

        int id = Integer.parseInt(inputOutput("Nhap ID ban muon chinh sua"));
        String newBirthday = inputOutput("Nhap ngay sinh ban muon chinh sua");
        String newGender = inputOutput("Nhap gioi tinh ban muon chinh sua");
        int newCMND = Integer.parseInt(inputOutput("Nhap CMND ban muon chinh sua"));
        String newNumberPhone = inputOutput("Nhap so dien thoai ban muon chinh sua");
        String newEmail = inputOutput("Nhap email ban muon chinh sua");
        String newClassify = inputOutput("Nhap thu hang ban muon chinh sua");
        String newAddress = inputOutput("Nhap dia chi ban muon thay doi");

        for (Customer customer: customers) {
            if (id == customer.getId()) {
                customer1 = customer;
            }
        }
       customer1.setBirthDay(newBirthday);
       customer1.setGender(newGender);
       customer1.setcMND(newCMND);
       customer1.setNumberPhone(newNumberPhone);
       customer1.seteMail(newEmail);
       customer1.setClassify(newClassify);
       customer1.setAddress(newAddress);

    }
    public void addCustomService() {
        int id = Integer.parseInt(inputOutput("Nhap ID ban muon them vao"));
        String birthDay = inputOutput("Nhap ngay sinh ban muon them vao");
        String gender = inputOutput("Nhap gioi tinh ban muon them vao");
        int CMND = Integer.parseInt(inputOutput("Nhap CMND ban muon them vao"));
        String numberPhone = inputOutput("Nhap so dien thoai ban muon them vao");
        String email = inputOutput("Nhap email ban muon them vao");
        String classify = inputOutput("Nhap thu hang ban muon them vao");
        String address = inputOutput("Nhap dia chi ban muon them vao");
        Customer customer = new Customer(id,birthDay,gender,CMND,numberPhone,email,classify,address);
        save(customer);
    }
}