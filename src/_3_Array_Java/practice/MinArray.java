package _3_Array_Java.practice;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,6,8};
        int min = minArr(arr);
        System.out.println("gia tri be nhat la : "+arr[min]);
    }
    public static int minArr(int[] Array) {
        int min = 0;
        for (int i = 0; i <Array.length;i++) {
            if (Array[i]<Array[min]) {
                min = i;
            }
        }
       return min;
    }
}
