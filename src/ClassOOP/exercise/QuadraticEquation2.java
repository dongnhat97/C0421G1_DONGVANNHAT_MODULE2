package ClassOOP.exercise;
import java.util.Scanner;
public class QuadraticEquation2 {
public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhap so a ");
        double a = sc.nextDouble();
        System.out.println("nhap so b");
        double b = sc.nextDouble();
        System.out.println("nhap so c");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
       if (a==0) {
           if (b==0) {
               System.out.println("co vo so nghiem");
           }else {
               System.out.println("co 1 nghiem duy nhat :"+quadraticEquation.oneExperiences());
           }
       }else if (quadraticEquation.getDelTa()<0) {
           System.out.println("phuong trinh vo nghiem");
       }else if (quadraticEquation.getDelTa()==0) {
           System.out.println("phuong trinh co nghiem kep: "+quadraticEquation.Experiences());
       }else {
           quadraticEquation.twoExperiences();
       }
    }
}
