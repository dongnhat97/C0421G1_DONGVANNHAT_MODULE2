package _1_Introduction_to_Java.practice;
import java.util.Scanner;

public class WidthHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("nhap can nang");
        weight= scanner.nextDouble();
        System.out.println("nhap chieu cao");
        height= scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi<18.5) {
            System.out.println("underweight");
        }else if (bmi<25) {
            System.out.println("Normal");
        }else if (bmi<30) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
