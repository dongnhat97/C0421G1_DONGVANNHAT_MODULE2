package _19_Regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberPhone;
        System.out.println("Moi nhap so dien thoai");
        numberPhone = scanner.nextLine();
        boolean check = Pattern.matches("\\d{2}-\\d{10}$",numberPhone);
        while (!check) {
            System.out.println("Khong dung voi ten lop , moi ban nhap lai");
            numberPhone = scanner.nextLine();
            check = Pattern.matches("\\d{2}-\\d{10}$",numberPhone);
        }
        System.out.println("ban nhap so dien thoai "+numberPhone);
    }
}
