package _3_Array_Java.practice;
import java.util.Scanner;
public class DaoNguoc {
    public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("moi ban nhap so");
             size = scanner.nextInt();

             if (size>20) {
                 System.out.println("vuot qua so luong");
             }
        }while (size>20);


         int[] arr = new int[size];

         for (int i = 0 ; i<arr.length;i++) {
             System.out.println("moi ban nhap phan tu thu " +i);
             arr[i]=scanner.nextInt();
         }
         for (int i =0; i<arr.length;i++) {
             System.out.println(arr[i]+"");
         }
         int first = 0;
         int last = arr.length-1;
         while (first<last) {
             int b = arr[first];
             arr[first]=arr[last];
             arr[last] = b;
             first++;
             last--;
         }
        for (int i = 0;i<arr.length;i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
