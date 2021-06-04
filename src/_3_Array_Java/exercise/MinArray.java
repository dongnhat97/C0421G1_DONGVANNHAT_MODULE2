package _3_Array_Java.exercise;
import java.util.Scanner;
public class MinArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap do dai cua mang");
        int size = scanner.nextInt();
        int[] arr= new int[size];

        for (int i = 0; i<arr.length;i++) {
            System.out.println("nhap phan tu cua mang");
            arr[i] = scanner.nextInt();
        }
        minArr(arr);


    }
    public static void minArr(int[] Array) {
        int min = Array[0];
        for (int i =1; i < Array.length;i++) {
            if (Array[i]<min) {
                min = Array[i];
            }
        }
        System.out.println("phan tu nho nhat la : "+min);

    }
}
