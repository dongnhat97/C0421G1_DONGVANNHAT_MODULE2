package _3_Array_Java.exercise;
import java.util.Scanner;
public class DeleteArray {
    public static void main(String[] args) {
        int i;
        int c;

        Scanner scanner = new Scanner(System.in);

            System.out.println("so luong phan tu trong mang ");
            int run = scanner.nextInt();
            int[] arr = new int[run];
            for ( i = 0; i < arr.length; i++) {
                System.out.println("nhap phan tu trong mang");
                arr[i] = scanner.nextInt();
            }
            for ( i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("chon phan tu ban muon xoa");
            int deleteArr = scanner.nextInt();
            for ( i =c= 0; i < arr.length; i++) {
                   if (arr[i]!=deleteArr) {
                       arr[i] = arr[c];
                       c++;
                   }

                }

            for ( c= 0 ; c<arr.length;c++) {
                System.out.println(arr[c]);
            }
            }
        }

