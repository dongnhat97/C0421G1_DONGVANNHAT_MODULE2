package _3_Array_Java.exercise;
import java.util.Scanner;
public class DeleteArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //khởi tạo mảng:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i);
            arr[i] = input.nextInt();
        }
//        System.out.println("array: ");    //tại sao dùng print() KHÔNG được???
//        for (int element : arr) {
//            System.out.print(element + " ");  //tại sao dùng print(element + " ") KHÔNG được???
//        }
        //nhập số muốn xóa
        System.out.println("\r Enter the number you want to delete: ");
        int delNum = input.nextInt();
        //kiểm tra số có trong mảng?
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (delNum == arr[i]) {
                check = true;
                System.out.println("This number at index " + i);
                if (i == arr.length - 1) {
                    arr[i] = 0;   //nếu phần tử cuối = số cần xóa ==> gán = 0 luôn, nếu không vòng lặp for bên dưới sẽ KHÔNG duyệt đc nó (vì j < arr.length - 1)
                } else {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = 0;   // gán bằng 0, đẩy dần về cuối mảng
                    }
                    i--;
                }
            }
        }
        if (check) {
            System.out.println("array after delete: ");
            for (int element : arr) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("NOT found this value in the array");
        }
    }
}

