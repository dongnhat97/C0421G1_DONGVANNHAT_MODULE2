package _3_Array_Java.practice;
import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.println("moi ban nhap do dai mang");
            size = scanner.nextInt();
            if (size>20) {
                System.out.println("ban da nhap qua gioi han");
            }
        }while (size>20);

        double[] arr = new double[size];
        for (int i = 0; i<arr.length;i++) {
            System.out.println("moi ban nhap so tien");
            arr[i] = scanner.nextDouble();
        }
        for (int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        double max = arr[0];
        for (int i = 1;i<arr.length;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("so tien lon nhat la : "+max);

    }
}
