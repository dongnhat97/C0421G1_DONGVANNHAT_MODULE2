package _15_Debug.practice;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so x ");
        int x = scanner.nextInt();
        System.out.println("nhap so y");
        int y = scanner.nextInt();
        examPle(x,y);
    }
    public static void examPle(int x , int y ) {
        try { int a = x+y;
            System.out.println("Tong phep toan "+a);
            int b = x-y;
            System.out.println("Hieu phep toan "+b );
            int c = x*y;
            System.out.println("tich phep toan "+c);
            int d = x/y;
            System.out.println("thuonng phep toan "+d);

        }
        catch (Exception e ) {
            System.out.println("truong hop ngoai le do y = "+e);
        }

    }
}
