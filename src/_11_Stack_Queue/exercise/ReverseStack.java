package _11_Stack_Queue.exercise;
import java.util.Arrays;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
//        System.out.println("khoi tao mang so nguyen");
//        int[] num = {1,2,3,4,5,6};
//        Stack<Integer> stack = new Stack<>();
//        System.out.println("mang truoc khi dao nguoc");
//        System.out.println(Arrays.toString(num));
////      "them phan tu vao mang"
//        for (int i=0 ; i<num.length;i++) {
//           stack.push(num[i]);
//        }
////       "dao nguoc phan tu
//        for (int i = 0 ; i <num.length;i++) {
//            num[i] = stack.pop();
//        }
//        System.out.println("mang sau khi dao phan tu");
//        System.out.println(Arrays.toString(num));
//
//    }
        Stack<String> stack1 = new Stack<>();
        String[] num1 = {"Nhat", "Cong", "Diep", "Ha"};
        System.out.println("mang truoc khi dao nguoc");
        System.out.println(Arrays.toString(num1));
//       them phan tu vao stack
        for (int i = 0 ; i<num1.length;i++) {
            stack1.push(num1[i]);
        }
//        dao nguoc phan tu
        for (int i = 0 ; i <num1.length;i++) {
            num1[i] = stack1.pop();
        }
    }
}