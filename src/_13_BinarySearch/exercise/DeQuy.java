package _13_BinarySearch.exercise;

public class DeQuy {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static void main(String[] args) {
        System.out.println(deQuy(list,45,12,0));

    }
    public static int deQuy(int[] list, int value , int high , int low) {
        if (high>=low) {
            int mid = (high + low)/2;
            if (value<list[mid]) {
                return deQuy(list,value,mid-1,low);
            }else if (value>list[mid]) {
                return deQuy(list, value,high,mid+1);

            }else {
                return mid;
            }
        }
        return -1;

    }
}
