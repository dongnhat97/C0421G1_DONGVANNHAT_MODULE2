package _3_Array_Java.exercise;
import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] newArr= new int[size+1];
        int i;
        int index;
        int addNumber;
        for (i = 0; i < arr.length;i++) {
            System.out.println("nhap phan tu mang 1");
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhap vi tri muon chen");
        index = scanner.nextInt();
        System.out.println("nhap phan tu muon chen");
        addNumber = scanner.nextInt();
        if (index<0||index>arr.length) {
            System.out.println("khong the chen phan tu");
        }else {
            for (i=0;i<index;i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = addNumber;
            for (i= index+1;i<newArr.length;i++) {
                newArr[i] = arr[i-1];

            }
        }
        for (i = 0 ; i <newArr.length;i++) {
            System.out.println(newArr[i]);
        }
    }
}
