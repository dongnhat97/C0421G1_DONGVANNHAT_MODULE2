package _3_Array_Java.exercise;
import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i<arr.length;i++) {
            System.out.println("nhap phan tu mang");
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("nhap phan tu muon add");
        int add = scanner.nextInt();
        System.out.println("nhap vi tri ban muon chen");
        int index = scanner.nextInt();
        for (int i = 0;i <arr.length;i++) {
            if (index==i) {
                i++;
                arr[i-1]=add;
            }
        }
        System.out.println(arr);

    }
}
