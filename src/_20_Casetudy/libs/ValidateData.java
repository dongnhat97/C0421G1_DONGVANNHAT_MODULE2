package _20_Casetudy.libs;

import java.util.regex.Pattern;

public class ValidateData {
//    Mã Villa
    public static String villaCode() {
        String regex = "^(SVVL)-[0-9]{4}$";
        boolean check = false;
        String villaCode = null;
        while (!check) {
            villaCode = Choice.inputOutput("Moi ban nhap ma code cho villa");
            if (Pattern.matches(regex,villaCode)) {
                 check = true;
            }else {
                System.out.println("Villa code la: 'SVVL-XXXX', X la so nguyen tu 0-9");
            }
        }
        return villaCode;
    }
    //        Mã House
    public static String houseCode() {
        String regex = "^(SVHO)-[0-9]{4}$";
        boolean check = false;
        String houCode = null;
        while (!check) {
            houCode = Choice.inputOutput("Moi ban nhap ma code cho House");
            if (Pattern.matches(regex,houCode)) {
                check = true;
            }else {
                System.out.println("Villa code la: 'SVH-XXXX', X la so nguyen tu 0-9");
            }
        }
        return houCode;
    }
//    Mã Room
    public static String roomCode() {
        String regex = "^(SVVL)-[0-9]{4}$";
        boolean check = false;
        String roomCode = null;
        while (!check) {
            roomCode = Choice.inputOutput("Moi ban nhap ma code cho Room");
            if (Pattern.matches(regex,roomCode)) {
                check = true;
            }else {
                System.out.println("Room code la: 'SVR-XXXX', X la so nguyen tu 0-9");
            }
        }
        return roomCode;
    }
    //tên dịch vụ: ok
    public static String serviceName() {
        String regex = "^[A-Z][a-zA-Z0-9]+$";
        boolean check = false;
        String name = null;
        while (!check) {
            name = Choice.inputOutput("Enter util name: ");
            if (Pattern.matches(regex, name)) {
                check = true;
            } else {
                System.err.println("Service name must start with a capital letter . Please enter in correct format!");
            }
        }
        return name;
    }
//    Diện tích hồ bơi
    public static float area() {
        String regex = "([1]\\d{2}.\\d{1,2})|([3-9][0-9].\\d{1,2})$";
        boolean check = false;
        float area = 0;
        while (!check) {
            System.out.println("Nhap dien tich ho boi");
            area = Choice.checkFloatException();
            if (Pattern.matches(regex,String.valueOf(area))){
                check = true;
            }else {
                System.out.println("Ban nhap sai du lieu , du lieu la 1 so thuc lon hon 30 vaf be hon 200 , moi ban nhap lai");
            }
        }
        return area;
    }
    //số người: ok
    public static int maxNumsPeople() {
        String regex = "^[1-9]|([1][0-9])?$"; // 1-9 | 10-19
        boolean check = false;
        int number = 0;
        System.out.println("Nhap so luong nguoi ");
        while (!check) {
            number = Choice.choiceMenu();
            if (Pattern.matches(regex, String.valueOf(number))) {
                check = true;
            } else {
                System.err.println("so luong nguoi toi da > 0 and <= 20. Vui long nhap lai ");
            }
        }
        return number;
    }
    //so tang:
    public static int numsOfFoors() {
        String regex = "^[1-5]$"; // 1-9 | 10-19
        boolean check = false;
        int numsOfFoors = 0;
        System.out.println("Chon so tang: ");
        while (!check) {
            numsOfFoors = Choice.choiceMenu();
            if (Pattern.matches(regex, String.valueOf(numsOfFoors))) {
                check = true;
            } else {
                System.err.println("So tang toi da la > 0 and <= 5. Vui long chon lai ");
            }
        }
        return numsOfFoors;
    }
    public static String houseStandard() {
        String regex = "^(SVHO)-[a-zA-Z0-9 ]+$";
        boolean check = false;
        String houseCode = null;
        while (!check) {
            houseCode = Choice.inputOutput("Nhap tieu chuan cua house ");
            if (Pattern.matches(regex, houseCode)) {
                check = true;
            } else {
                System.err.println("Please enter house standard according to the format: 'SVHO-standardName' ");
            }
        }
        return houseCode;
    }
    public static String roomStandard() {
        String regex = "^(SVRO)-[a-zA-Z0-9 ]+$";
        boolean check = false;
        String roomCode = null;
        while (!check) {
            roomCode = Choice.inputOutput("Enter room standard: ");
            if (Pattern.matches(regex, roomCode)) {
                check = true;
                System.out.println("ok");
            } else {
                System.err.println("Please enter room standard according to the format: 'SVRO-standardName' ");
            }
        }
        return roomCode;
    }
    //kiểu thuê:  ok
    public static String villaStandard() {
        String regex = "^(SVVL)-[a-zA-Z0-9 ]+$";
        boolean check = false;
        String villaStandard = null;
        while (!check) {
            villaStandard = Choice.inputOutput("Enter villa standard: ");
            if (Pattern.matches(regex, villaStandard)) {
                check = true;
                System.out.println("ok");
            } else {
                System.err.println("Please enter villa standard according to the format:  'SVVL-standardName'");
            }
        }
        return villaStandard;
    }

}
