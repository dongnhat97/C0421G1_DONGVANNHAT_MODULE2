package _11_Stack_Queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class HeNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> binary = new Stack<>();
        System.out.println("Nhập số thập phân: ");
        int input = scanner.nextInt();
        while (input != 0) {
            int result = input % 2;
            binary.push(result);
            input /= 2;
        }
        int size = binary.size();
        System.out.println(binary);
        System.out.println("Số nhị phân tương ứng là: ");
        for (int i = 0; i < size; i++) {
            System.out.println(binary.pop());
        }
    }
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        System.out.println("nhap so thap phan");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        while (num!=0) {
//            int number = num%2;
//            stack.push(number);
//            num/=2;
//        }
//        int size = stack.size();
//        System.out.println(stack);
//        for (int i = 0 ; i<size;i++) {
//            System.out.println("gia tri nhi phan la "+stack.pop());
//        }
//    }
}
