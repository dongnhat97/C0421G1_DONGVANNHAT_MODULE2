package _3_Array_Java.practice;
import java.util.Scanner;
public class TimGiaTri {
    public static void main(String[] args) {
        String[] student= {"hello","goodbye","love"};
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0 ; i<student.length;i++) {
            if (student[i].equals(name)) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("gia tri can tim : "+name);
        }
    }
}
