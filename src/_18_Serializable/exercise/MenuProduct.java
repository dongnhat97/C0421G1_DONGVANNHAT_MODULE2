package _18_Serializable.exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProduct {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Product1> products = new ArrayList<>();
        products.add(new Product1(1,"iphone",122,"apple"));
        MainProduct mainProduct = new MainProduct();

        System.out.println("nhap file");
        String filepath = scanner.nextLine();
        File file = new File(filepath);
        mainProduct.writeToFile(file,products);

        while (true) {

            System.out.println("chon menu");
            System.out.println("1: hien thi san pham");
            System.out.println("2: tim kiem san pham");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: mainProduct.disPlay(file);
                break;
                case 2: mainProduct.searchProductByName(file);
                break;
                default:
                    System.out.println("khong co trong menu");
                    break;

            }
        }
    }
}
