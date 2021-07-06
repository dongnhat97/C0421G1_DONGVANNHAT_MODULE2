package _20_Casetudy.libs;

import java.util.Scanner;

public class Choice {
    public static Scanner scanner = new Scanner(System.in);

//    public static int choiceMenuMini(String message) {
//        boolean check = false;
//        int choice = 0;
//        while (!check) {
//            try {
//                System.out.println(message);
//                choice = Integer.parseInt(scanner.nextLine());
//                check = true;
//            } catch (NumberFormatException e) {
//                System.out.println("ban nhap sai du lieu menu roi , moi ban nhap lai");
//            }
//        }
//        return choice;
//    }
    public static float checkFloatException() {
        boolean check = false;
        float value = 0;
        while (!check) {
            try {
                System.out.println("Moi ban nhap dien tich ho boi");
                value = Float.parseFloat(scanner.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.err.println("dien tich phai la so thap phan , moi ban nhap lai");
            }
        }
        return value;
    }

    public static int choiceMenu() {
        boolean check = false;
        int choice = 0;
        while (!check) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("ban nhap sai du lieu menu roi , moi ban nhap lai");
            }
        }
        return choice;
    }
    public static String inputOutput(String message) {
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }
}