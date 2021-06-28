package _0_BaitapAnhtrung;

import java.util.Scanner;

public class TeacherManagement {
    public static Scanner scanner = new Scanner(System.in);
//    private static StudentIpl studentIpl = new StudentIpl();
    private static TeacherIpl teacherIpl = new TeacherIpl();

    public static void main(String[] args) {
        System.out.println("chuong trinh quan ly sinh vien");
        while (true) {
            System.out.println(" menu chuong trinh");
            System.out.println("1 xem thong trinh sinh vien");
            System.out.println("2 xoa  thong tin sinh vien");
            System.out.println("3 chinh sua moi thong tin sinh vien");
            System.out.println("4 them moi sinh vien");
            System.out.println("5 them moi giao vien");
            System.out.println("6 xem thog tin giao vien");
            System.out.println("7 xem danh sach giao vien");
            System.out.println("chon chuc nang muon su dung");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    teacherIpl.creatTeacher();
                    break;
                case 2:
                    teacherIpl.deleteTeacher();
                    break;
                case 3:
//                    studentIpl.editStudent();
                    break;
                case 4:
//                    studentIpl.createNewStudent();
                    break;
                case 5:
//                    creatTeacher();
                    break;
                case 6:
//                    displayTeacher(people);
                    break;
                case 7:
                    System.exit(7);
                    break;
                default:
                    System.out.println("vuot ngoai danh sach");
            }
        }
    }
}
