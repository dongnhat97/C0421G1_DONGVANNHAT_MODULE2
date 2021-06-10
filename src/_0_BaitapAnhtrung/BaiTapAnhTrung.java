package _0_BaitapAnhtrung;

import java.util.Scanner;
public class BaiTapAnhTrung {
    public static Scanner scanner = new Scanner(System.in);
    public static PerSon[] people;

    static {
        people = new PerSon[50];
        people[0] = new Student1(1, "nhat", 18, "ha tinh", "c04");
        people[1] = new Student1(2, "ha", 36, "gia lai", "c04");
        people[2] = new Student1(3, "diep", 28, "quang binh", "c04");
        people[3] = new Student1(4, "tao", 21, "da nang", "c04");
        people[4] = new Teacher(5, "chien,", 25, "dang nang", "codegym")

    }

    public static void main(String[] args) {
        System.out.println("chuong trinh quan ly sinh vien");
        while (true) {
            System.out.println(" menu chuong trinh");
            System.out.println("1 xem thong trinh sinh vien");
            System.out.println("2 xoa  thong tin sinh vien");
            System.out.println("3 chinh sua moi thong tin sinh vien");
            System.out.println("4 them moi sinh vien");
            System.out.println("5 them moi giao vien");
            System.out.println("6 thoat chuong trinh");
            System.out.println("chon chuc nang muon su dung");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    disPlayStudent(people);
                    break;
                case 2:
//                    deleteStudent(people);
                    break;
                case 3:
//                    editStudent(people);
                    break;
                case 4:
//                    creatStudent(people);
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("vuot ngoai danh sach");
            }
        }
    }

    public static void disPlayStudent(PerSon[] people) {
        for (PerSon perSon : people) {
            if (perSon instanceof Student1) {
                System.out.println(perSon);
                ((Student1)((Student1) perSon).study(););
            }
        }
    }
}
//    public static void deleteStudent(Student[] students) {
//        System.out.println("nhap id sinh vien minh muon xoa");
//        int newID = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i<students.length;i++) {
//            if (students[i].getId()==newID) {
//                students[i].setId(0);
//                students[i].setAddress(null);
//                students[i].setAge(0);
//                students[i].setName(null);
//                break;
//            }
//        }
//    }
//    public static void creatStudent(Student[] students) {
//        System.out.println("nhap id ban muoon them vao ");
//        int id= Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap ten cho sinh vien moi");
//        String name = scanner.nextLine();
//        System.out.println("nhap tuoi cho sinh vien moi");
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap dia chi cho sinh vien ");
//        String addressStudent= scanner.nextLine();
//
//        for (int i = 0 ; i<students.length;i++) {
//            Student newStudent = new Student(id,name,age,addressStudent);
//            if (students[i]==null) {
//                students[i] =newStudent;
//                break;
//            }
//        }
//    }
//    public static void editStudent(Student[] students) {
//        System.out.println("nhap id sinh vien ban muon chinh sua");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap id ban muon thay the");
//        int newID = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap ten ban muon thay the");
//        String newName = scanner.nextLine();
//        System.out.println("nhap tuoi ban muon thay the");
//        int newAge = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhap dia chi ban muon thay the");
//        String newAddress = scanner.nextLine();
//        for (int i = 0 ; i<students.length;i++) {
//            if (id ==students[i].getId()) {
//                students[i].setId(newID);
//                students[i].setName(newName);
//                students[i].setAge(newAge);
//                students[i].setAddress(newAddress);
//                break;
//            }else if (newID==students[i].getId()) {
//                System.out.println("trung id roi");
//            }
//        }
//    }
//}