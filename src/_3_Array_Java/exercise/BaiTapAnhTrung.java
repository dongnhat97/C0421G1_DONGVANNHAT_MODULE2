package _3_Array_Java.exercise;

import java.util.Scanner;
public class BaiTapAnhTrung {
    public static Scanner scanner = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
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
                    list(studens);
                    break;
                case 2:
                    deleteStudent(studens);
                    break;
                case 3:
                    editStudent(studens);
                    break;
                case 4:
                    addStudent(studens);
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("moi ban chon lai ");
                    break;

            }
        }

    }
//    hàm chỉnh sửa thông tin sinh viên
    public  static  void editStudent(String[] student) {
        String editStudent =inPut("moi nhap sinh vien ban muon chinh sua");
        String infoEdit = inPut("thong tin ban muon chinh sua");
        for (int i = 0 ; i<student.length;i++) {
            if (editStudent.equals(student[i])) {
                student[i]=infoEdit;
                break;
            }
        }
    }
//    hàm thêm sinh viên
    public static void addStudent(String[] student) {
        String addStudent = inPut("them sinh vien ");
        for (int i = 0 ; i<student.length;i++) {
            if (student[i]==null) {
                student[i] = addStudent;
                break;
            }
        }
    }
//    hàm xóa sinh vien
    public static void deleteStudent(String[] students) {
        String deleteStudent = inPut("nhap ten sinh vien ban muon xoa");
        for (int i = 0; i <students.length;i++) {
            if (deleteStudent.equals(students[i])) {
                students[i] = null;
                break;
            }
        }

    }
//    Hàm list sinh viên
    public static void list(String[] students) {
        for (String list : students) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }
    public static String inPut(String message) {
        System.out.println(message);
        return sc.nextLine();
    }
}
