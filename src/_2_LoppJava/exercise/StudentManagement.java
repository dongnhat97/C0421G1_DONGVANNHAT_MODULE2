package _2_LoppJava.exercise;
import java.util.Scanner;
public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------Chuong trinh quan ly sinh vien-----------------------");
        String[] studens = new String[50];
        while (true) {
            System.out.println("menu chuong trinh");
            System.out.println("1: xem danh sach sinh vien");
            System.out.println("2: xoa sinh vien");
            System.out.println("3: chinh sua thong tin sinh vien");
            System.out.println("4: them moi sinh vien");
            System.out.println("5: thoat chuong trinh");
            System.out.println("chon chu nang muon su dung");
            int choice= scanner.nextInt();
            switch (choice) {
                case 1:
                    for (String students: studens);
                    break;
                case 2:
                    System.out.println("vui long nhap danh sach sinh vien ban muon xoa");
                    String deleteStudent = scanner.nextLine();
                    for (int i = 0;i<studens.length;i++) {
                        if (deleteStudent.equals(studens[i])) {
                            studens[i]=null;
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhap ten sinh vien ban muon chinh sua");
                    String editStudent = scanner.nextLine();
                    System.out.println("thong tin ban muon chinh sua");
                    String editStudent2= scanner.nextLine();
                    for (int i =0; i<studens.length;i++) {
                        if (editStudent.equals(studens[i])) {
                               editStudent2=studens[i];
                        }
                    }
                    break;
                case 4:
                    System.out.println("nhap ten sinh vien ban muon them vao");
                    String newStudent= scanner.nextLine();
                    for (int i = 0; i <studens.length;i++) {
                        if (studens[i]==null) {
                            studens[i] = newStudent;
                            break;
                        }
                    }
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("cho nguoi dung nhap lai neu chon nham");

            }
        }

    }
}
