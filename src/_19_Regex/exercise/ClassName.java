package _19_Regex.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        System.out.println("Moi nhap ten lop");
        className = scanner.nextLine();
        boolean check = Pattern.matches("[C|A|P]+[0-9]*+[G|H|I|K|L|M]$",className);
        while (!check) {
            System.out.println("Khong dung voi ten lop , moi ban nhap lai");
            className = scanner.nextLine();
            check = Pattern.matches("[C|A|P]+[0-9]*+[G|H|I|K|L|M]$",className);
        }
        System.out.println("Co lop hoc la "+className);
    }


}
