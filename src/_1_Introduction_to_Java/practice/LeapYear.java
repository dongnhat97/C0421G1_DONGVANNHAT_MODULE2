package _1_Introduction_to_Java.practice;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("vui long nhap nam ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
            if (isLeapYear) {
                System.out.println("day la nam nhuan");
            } else {
                System.out.println("day khong phai nam nhuan");
            }
        }
    }
}
