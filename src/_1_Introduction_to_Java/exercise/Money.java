package _1_Introduction_to_Java.exercise;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("vui long nhap so tien");
        double VND = scanner.nextDouble();
        usd = VND*23000;
        System.out.println("so tien : " +usd);
    }
}
