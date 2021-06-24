package _14_SapXep.practice;

import java.util.Arrays;

public class SelectionSort {
//    sắp xếp chọn
    static double[] list = { 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));

    }
    public static void selectionSort(double[] arr) {
        for (int i = 0;i<arr.length-1;i++) {
            double min = arr[i];
            int index = i;
            for (int j=i+1;j <arr.length;j++) {
                if (min>arr[j]) {
                    min = arr[j];
                    index=j;
                }

            }
            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
    }
}
