package _20_Casetudy.services;

import _20_Casetudy.models.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    //    tạo đối tượng từ lớp emp để gọi hàm choiceMenu check exeption
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedHashMap<Facility, Integer> facility = new LinkedHashMap<>();

    static {
        facility.put(new House("House1", "270m2", "200$", "09785644312", "Vip ", "Vip room", "15"), 1);
        facility.put(new Room("Room1", "560", "111", "098323233", "ok", "tam bun"), 1);
        facility.put(new Villa("Villa1", "586", "20$", "19008273", "Vip", "suupper room", "200m2", "30"), 5);
    }

    @Override
    public void showInfo() {
        for (Map.Entry<Facility, Integer> entry : facility.entrySet()) {
            System.out.println(entry.getKey() + "\n"  + "Used times: " + entry.getValue());
        }
    }

    @Override
    public void displayListMaintenance() {
        System.out.println(("Facilities need to maintain: "));
        for (Map.Entry<Facility, Integer> entry : facility.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey().getService() + ", used times: " + entry.getValue());
            }
        }
    }

    public void addFacility() {
        System.out.println("Moi ban chon dich vu");
        System.out.println("1: House");
        System.out.println("2: Room");
        System.out.println("3: Villa");
        boolean check = false;
        while (!check) {

            int choice = employeeService.choiceMenu();
            switch (choice) {
                case 1:
                    String service = inputOutput("Nhap phong  ban muon them vao");
                    String area = inputOutput("Nhap dien tich ban muon them vao");
                    String cost = inputOutput("Nhap gia tien ban mon them vao");
                    String numberPhone = inputOutput("Nhap so dien thoai ban muon them vao");
                    String rentalType = inputOutput("Nhap  loai cho the ban muon them vao");
                    String roomStandard = inputOutput("Nhap  tieu chuan phong ban muon them vao");
                    String floorsNumber = inputOutput("Nhap  so tang ban muon them vao");
                    facility.put(new House(service, area, cost, numberPhone, rentalType, roomStandard, floorsNumber), 0);
                    check = true;
                    break;
                case 2:
                    String service2 = inputOutput("Nhap phong  ban muon them vao");
                    String area2 = inputOutput("Nhap dien tich ban muon them vao");
                    String cost2 = inputOutput("Nhap gia tien ban mon them vao");
                    String numberPhone2 = inputOutput("Nhap so dien thoai ban muon them vao");
                    String rentalType2 = inputOutput("Nhap  loai cho the ban muon them vao");
                    String freeService2 = inputOutput("Nhap  dich vu mien phi ban muon them vao");
                    facility.put(new Room(service2, area2, cost2, numberPhone2, rentalType2, freeService2), 0);
                    check = true;
                    break;
                case 3:
                    String service3 = inputOutput("Nhap phong  ban muon them vao");
                    String area3 = inputOutput("Nhap dien tich ban muon them vao");
                    String cost3 = inputOutput("Nhap gia tien ban mon them vao");
                    String numberPhone3 = inputOutput("Nhap so dien thoai ban muon them vao");
                    String rentalType3 = inputOutput("Nhap  loai cho the ban muon them vao");
                    String roomStandard3 = inputOutput("Nhap  tieu chuan phong ban muon them vao");
                    String poolArea = inputOutput("Nhap  dien tich ho boi ban ban muon them vao");
                    String floorsNumber3 = inputOutput("Nhap  so tang ban muon them vao");
                    facility.put(new Villa(service3, area3, cost3, numberPhone3, rentalType3, roomStandard3, poolArea, rentalType3), 0);
                    check = true;
                    break;
                default:
                    System.out.println(" khong co trong menu , moi ban nhap lai");
            }
        }
    }
        private String inputOutput (String message){
            System.out.println(message);
            String output = scanner.nextLine();
            return output;
        }

    }


