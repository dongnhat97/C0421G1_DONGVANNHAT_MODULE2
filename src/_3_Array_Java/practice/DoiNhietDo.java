package _3_Array_Java.practice;
import java.util.Scanner;
public class DoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c;
        double f;
        int choice;
        do {
            System.out.println("menu");
            System.out.println("nhap 1 de doi fahrenheit ra celsius");
            System.out.println("nhap 2 de doi celsius ra fahrenheit");
            System.out.println(" nhap 0 de thoat");
            System.out.println("nhap choice de kick hoat");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("moi ban nhap fahrenheit");
                    f = scanner.nextDouble();
                    System.out.println(f + " fahrenheit" + " = " + fahrenheitToCelsius(f));
                    break;
                }
                case 2: {
                    System.out.println("moi ban nhap celsius");
                    c = scanner.nextDouble();
                    System.out.println(c + " celsius" + " = " + celsiusToFahrenheit(c));
                    break;
                }
                case 0:
                    System.exit(0);

            }
        }while (choice!=0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
