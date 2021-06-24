package _14_SapXep.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    static int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList= new ArrayList<>();
//        for (int i  =0 ; i<arr.length;i++) {
//            arrayList.add(arr[i]);
//        }
//        System.out.println(arrayList);
//        arrayList.sort(Integer::compareTo);
//        System.out.println(arrayList);

//Nổi bọt

   bubbleSort(arr);
        for (int element : arr) {
            System.out.println(element+" ");
        }
    }
    public static void bubbleSort(int[]arr) {
        boolean check = true;
        for (int k =1 ; k<arr.length&&check;k++) {
            check=false;
            for (int i = 0;i<arr.length-k;i++) {
                if (arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    check=true;
                }
            }

        }
    }

}