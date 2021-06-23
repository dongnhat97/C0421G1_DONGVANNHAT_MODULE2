package _12_Conllections.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductManager {
    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Product product = new Product(1, "Nokia", 35.5);
        Product product1 = new Product(5, "Iphone", 38.5);
        Product product2 = new Product(3, "1280", 2.5);
        Product product3 = new Product(4, "Samsung", 26.5);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.remove(2);
        System.out.println(products);
        System.out.println("sap xep theo thu tu tang dan");
//        Map<String, Product> map = new HashMap<String, Product>();
//        sắp xếp tăng dần theo price
        PriceComparator priceComparator = new PriceComparator();
        products.sort(priceComparator);

        for (Product element : products) {
            System.out.println(element);
        }
//     deleteID(products, 1);
//        để đây gần thi làm lại switch case để duyệt được liên tục
      while (true) {
          editProduct(products);
          System.out.println("List Array sau khi chinh sua ");
          for (Product element : products) {
              System.out.println(element);
          }
          searchName(products);
          System.out.println("sau khi tim ten ");
          for (Product elemen: products) {
              System.out.println(elemen);
          }
      }
//     editProduct(products);
//        System.out.println("List Array sau khi chinh sua ");
//        for (Product element : products) {
//            System.out.println(element);
//        }
//     searchName(products);
//        System.out.println("sau khi tim ten ");
//        for (Product elemen: products) {
//            System.out.println(elemen);
//        }

    }

//    Hàm sửa thông tin sản phẩm qua ID
    public static void editProduct(ArrayList<Product> products) {
        System.out.println("nhap id muon thay doi");
        int id = scanner.nextInt();

        System.out.println("nhap ID moi");
        int newID = scanner.nextInt();
        System.out.println("nhap ten moi cho san pham");
        String newName = scanner.next();
        System.out.println("nhap gia moi cho san pham");
        double newPrice = scanner.nextDouble();
        for (int i = 0 ; i <products.size();i++) {
            if (products.get(i).getId()==id) {
                products.get(i).setId(newID);
                products.get(i).setName(newName);
                products.get(i).setPrice(newPrice);
                System.out.println("thong tin sau khi chinh sua");
                System.out.println(products.get(i));
                break;
            }

        }


    }
//    Hàm tìm kiếm sản phẩm theo tên
    public static  void searchName(ArrayList<Product> products) {
        System.out.println("tim kiem san phan bang ten");

       String name = scanner.nextLine();

        boolean check = false;
        int index = 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                check = true;
                index=i;
                break;
            }else {
                check = false;
            }

        }
        if (check) {
            System.out.println(products.get(index));
        }else {
            System.out.println("k co gia tri");
        }

    }
//    Ham xóa sản phẩm từ ID
    public static void deleteID(ArrayList<Product> products , Integer id) {
        System.out.println("xoa san phan bang ten id");
         id = scanner.nextInt();

        for (int i = 0 ; i < products.size();i++) {
            if (products.get(i).getId()==id){
                products.remove(products.get(i));
                break;
            }
        }
        System.out.println("phan tu sau khi xoa");
        for (Product element: products) {
            System.out.println(element);
        }

    }


}
