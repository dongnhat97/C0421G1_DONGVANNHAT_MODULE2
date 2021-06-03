package _2_LoppJava.practice;
import java.util.Scanner;
public class LaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        double money,interestRate,totalInterest;
        totalInterest=0;
        System.out.println("nhap month");
        month = scanner.nextInt();
        System.out.println("nhap so tien gui");
        money = scanner.nextDouble();
        System.out.println("nhap so lai suat");
        interestRate = scanner.nextDouble();
        for (int i=0;i<month;i++) {
            totalInterest+= money*(interestRate/100)/12*month;
        }
        System.out.println("tien lai ngan hang : "+totalInterest);
    }
}
