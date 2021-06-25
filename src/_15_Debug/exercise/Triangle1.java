package _15_Debug.exercise;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
         int a = scanner.nextInt();
        System.out.println("nhap so b");
         int b = scanner.nextInt();
        System.out.println("nhap so c");
         int c = scanner.nextInt();
         try {
             checkTriangle(a,b,c);
         }catch (exceptionTriangle e ){
             System.out.println("sinh ngoai le "+e.getMessage());
         }catch (Exception e) {
             System.out.println("sinh ngoai le "+e.getMessage());
         }
    }
    public static void checkTriangle(int a , int b , int c) throws exceptionTriangle {
        if (a<0||b<0||c<0||a+b<c||a+c<b||b+c<a) {
            throw new exceptionTriangle("khong duoc nhap so am \n" +
                    "tong 2 canh phai lon hon canh con lai");
        }else System.out.println("ok");

    }
}
