package _3_Array_Java.exercise;
import java.util.Scanner;
public class MaxArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("chieu so hang");
        int rows= scanner.nextInt();
        System.out.println("nhap so cot");
        int cols = scanner.nextInt();
     int[][] aRay = new int[rows][cols];
     for (int i = 0;i<rows;i++) {
         for (int j= 0 ;j<cols;j++) {
             System.out.println("nhap phan tu vao ma tran");
             aRay[i][j]= scanner.nextInt();
         }
     }
        System.out.println("gia tri lon nhat la :"+maxArr(aRay));
    }
    public static int maxArr(int [][] arr) {
        int max = 0;
        for (int[]each: arr) {
            for (int each2: each) {
                if (each2>max) {
                    max=each2;
                }
            }
        }
        return max;
    }
}
