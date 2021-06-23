package _13_BinarySearch.practice;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static void main(String[] args) {
        int result =  binarySearch(list,59);
        if (result>=0) {
            System.out.println("tim ra phan tu can tim tai vi tri: "+result);
        }else {
            System.out.println("khong tim duoc phan tu do");
        }

    }
     static int binarySearch(int[]list, int value) {
        int left = 0;
        int right = list.length-1;

        while (right>=left) {
            int mid = (left+right)/2;
            if (value==list[mid]) {
                return mid;
            }else if (value<list[mid]) {
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
     }
}
