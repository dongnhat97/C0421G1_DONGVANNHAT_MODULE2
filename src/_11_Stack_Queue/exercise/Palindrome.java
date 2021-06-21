package _11_Stack_Queue.exercise;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "anh yeu em yeu anh";
        String[]arr = str.split(" ");
        Stack<String> stack = new Stack<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 0 ; i<arr.length;i++) {
            stack.push(arr[i]);
            queue.offer(arr[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        int num = 0;
        for (int i =0;i<arr.length;i++) {
            if (stack.pop().equals(queue.poll())) {
                num++;
            }
        }
        if (num == arr.length) {
            System.out.println("day la chuoi Palindrome");
        }else {
            System.out.println("day khong phai chuoi Palindrome");
        }
    }
}
