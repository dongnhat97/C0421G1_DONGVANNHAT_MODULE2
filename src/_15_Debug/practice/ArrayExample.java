package _15_Debug.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
//        ArrayExample arrayExample = new ArrayExample();
//       int[]arr = arrayExample.createRandom();
        createRandom();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap so ngau nhien");
//        int x = scanner.nextInt();
//        try {
//            System.out.println("gia tri phan tu "+x+" la "+arr[x]);
//        }catch (IndexOutOfBoundsException e) {
//            System.err.println("vi tri "+e+" khong co trong tap hop nay");
//        }


    }
    public static int[] createRandom() {
        int i;
        Random random = new Random();
        int[]arr = new int[100];
        System.out.println("danh sach phan tu cua mang");
        for ( i = 0; i<arr.length;i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ngau nhien");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri phan tu "+x+" la "+arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.err.println("vi tri "+e+" khong co trong tap hop nay");
        }
        return arr;
    }
}
