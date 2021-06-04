package _3_Array_Java.exercise;
import java.util.Scanner;
public class DeleteArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size;
        int i;
        int deleteNumber;
        System.out.println("nhap do dai mang");
        size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;
//        int[] arr2 = new int[size-count];
        for (i = 0 ; i<arr.length;i++) {
            System.out.println("nhap phan tu trong mang");
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhap phan tu ban muon xoa");
         deleteNumber = scanner.nextInt();
         for (i=0; i <arr.length;i++) {
             if (deleteNumber!=arr[i]) {
                 count++;
             }

         }
        int[] arr2 = new int[size-count];
         for (i=0;i<arr2.length;i++) {
             if (arr[i]!=deleteNumber) {
                 arr2[i] = arr[i];
             }
         }
         for (i=0;i<arr2.length;i++) {
             System.out.println(arr2[i]);
         }

    }
}

