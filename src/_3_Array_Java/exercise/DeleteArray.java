package _3_Array_Java.exercise;
import java.util.Scanner;
public class DeleteArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size;
        int i;
        int j;
        int deleteNumber;
        System.out.println("nhap do dai mang");
        size = scanner.nextInt();
        int[] arr = new int[size];

        for (i = 0 ; i<arr.length;i++) {
            System.out.println("nhap phan tu trong mang");
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhap phan tu ban muon xoa");
         deleteNumber = scanner.nextInt();
        boolean check = false;
        for (i=0;i<arr.length;i++) {
            if (deleteNumber==arr[i]) {
                check = true;
                System.out.println(i);
                for (j=i;j<arr.length-1;j++) {
                    arr[j] = arr[j+1];
                    arr[j+1]=0;
                }
                System.out.println("mang sau khi xoa phan tu");
                for (int element: arr) {
                    System.out.println(element);
                }
                break;
            }
        }
        if (!check) {
            System.out.println("khong co phan tu nay trong mang ");
        }
    }
}

