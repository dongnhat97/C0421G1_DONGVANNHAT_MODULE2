package ClassOOP.practice;
import java.util.Scanner;
public class Rectangle2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap chieu rong");
        double width = sc.nextDouble();
        System.out.println("nhap chieu dai");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("check chieu dai va chieu rong"+rectangle.display());
        System.out.println("tinh dien tich"+rectangle.getArea());
        System.out.println("tinh chu vi"+rectangle.getPerimeter());
    }
}
