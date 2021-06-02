package _1_Introduction_to_Java.exercise;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap ten");
        String name = scanner.nextLine();
        System.out.println("Hello :" +name);
    }
}
