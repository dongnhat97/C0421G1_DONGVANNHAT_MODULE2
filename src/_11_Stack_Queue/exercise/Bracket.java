package _11_Stack_Queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String str = scanner.nextLine();
        System.out.println(isTrue(str));
    }
    public static boolean isTrue(String str) {

          Stack<Character> stack = new Stack<>();
           char left;
          for (int i = 0 ; i<str.length();i++) {
              left=str.charAt(i);
              if (left=='(') {
                  stack.push(left);
              }else if (left==')') {
                  if (stack.isEmpty()) {
                      return false;
                  }else {
                      stack.pop();
                  }
              }
          }
          return stack.isEmpty();
    }
}