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

      while (true) {
          System.out.println("nhap 1 de hien thi thong tin dah sach san pham");
          System.out.println("nhap 2 de chon tim kiem san pham theo ten");
          System.out.println("nhap 3 de chon xoa san pham tu id");
          System.out.println("chon 4 de chinh sua thong tin san pham theo id ");
          System.out.println("chon 5 de thoat");
          int choice = scanner.nextInt();
          switch (choice) {
              case 1:
                  Show(products);
                  break;
              case 2:
                  searchName(products);
                  break;
              case 3:
                  deleteID(products);
                  break;
              case 4:
                  editProduct(products);
                  break;
              case 5:
                  System.exit( 5);
                  break;
              default:
                  System.out.println("vuot qua gioi han danh sach");
                  break;




          }
      }


    }
//    Hàm hiển thích danh sách sản phẩm
    public static void Show(ArrayList<Product> products) {
        for (Product element : products) {
            System.out.println(element);
        }
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

       String name = scanner.next();

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
    public static void deleteID(ArrayList<Product> products ) {
        System.out.println("xoa san phan bang ten id");
         int id = scanner.nextInt();

        for (int i = 0 ; i < products.size();i++) {
            if (products.get(i).getId()==id){
                products.remove(products.get(i));
                break;
            }
        }

    }


}
