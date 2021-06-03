package LoppJava.practice;
import java.util.Scanner;
public class Picture1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("go phim 1 de ra hinh tam giac");
        System.out.println("go phim 2 de ra hinh chu nhat");
        System.out.println("go phim 3 de ra hinh vuong");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                for (int i=0;i<=5;i++){
                    for (int j =5;j>=i;j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 2:
                
        }

    }
}
