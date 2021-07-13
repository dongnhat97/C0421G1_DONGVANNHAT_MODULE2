package _20_Casetudy.libs;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
        String regex = "^(SVR)-[0-9]{4}$";
        boolean check = false;
        String roomCode = null;
        while (!check) {
            roomCode = Choice.outputStringRegex("Moi ban nhap ma code cho Room");
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
        String regex = "^(([3-9]\\d+)|([12]\\d{2,}))\\.\\d$";
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
    public static String dateOfBirth() {  //ok
        String regex = "^(?=\\d{2}([\\/])\\d{2}\\1\\d{4}$)(?:0[1-9]|1\\d|[2][0-8]|29(?!.02.(?!(?!(?:[02468][1-35-79]|" +
                "[13579][0-13-57-9])00)\\d{2}(?:[02468][048]|[13579][26])))|30(?!.02)|31(?=.(?:0[13578]|10|12))).(?:0[1-9]|1[012]).\\d{4}$";
        boolean check = false;
        String birthDate = null;
        while (!check) {
            birthDate = Choice.inputOutput("Nhập ngày sinh theo format: 'dd/MM/yyy': ");
            //check format:
            if (Pattern.matches(regex, birthDate)) {
                check = checkAge(birthDate);
            } else {
                System.err.println("Wrong format. Please input day according to format: 'dd/MM/yyy'\n" +
                        "And make sure the number of days in the month is valid ");
            }
        }
        return birthDate;
    }
    public static boolean checkAge(String birthDay) {
        //check số tuổi:
        //check số ngày case rieeeng từng tháng:
        String[] arr = birthDay.split("/");
        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //tạo pattern. nếu không --> default = ISO_LOCAL_DATE: yyyy-mm-dd  --> báo Ex
        LocalDate birthDate_LocalDay = LocalDate.parse(birthDay, formatter);  //ép kiểu ngày sinh: String--> LocalDay theo định dạng "dd/MM/yyyy"
        LocalDate currentDate = LocalDate.now();  //lấy ngày hiện tại của hệ thống
        int years_gap = Period.between(birthDate_LocalDay, currentDate).getYears();  //lấy tuổi
        int month_gap = Period.between(birthDate_LocalDay, currentDate).getMonths();  //lấy tuổi
        int day_gap = Period.between(birthDate_LocalDay, currentDate).getDays();  //lấy tuổi
        if (years_gap > 18 && years_gap <= 100) {
            System.out.println("ok");
            return true;
        } else if (years_gap == 18 && month_gap >= 0 && day_gap >= 0) {
            System.out.println("ok");
            return true;
        } else {
            System.err.println("Age is out of range: age must be >=18 and <=100 ");
            return false;
        }
    }
    public static String emaill() {
        String regex ="^[A-Za-z0-9]+@[a-z]+\\.[a-z]+$";
        boolean check = false;
        String emaill = null;
        while (!check) {
            emaill = Choice.inputOutput("Nhạp emaill thêm mới");
            if (Pattern.matches(regex,emaill)) {
                check = true;
            }else {
                System.out.println("Bạn nhập chưa đúng với Fomat , vui lòng nhập lại");
            }
        }
        return emaill;
    }

}
