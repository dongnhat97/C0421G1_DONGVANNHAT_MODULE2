package _3_Array_Java.exercise;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng: ");
        int size =  sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập array["+i+"]: ");
            array[i]=sc.nextInt();
        }
        System.out.println("Nhập vị trí của mảng: ");
        int index=sc.nextInt();
        System.out.println("Nhập giá trị phần tử: ");
        int value = sc.nextInt();
        int[] result=new int[size+1];
        if(index<0 || index>size+1){
            System.out.println("Can't Insert");
        }
        else{
            for(int i=0;i<index;i++){
                result[i]=array[i];
            }
            result[index]=value;
            for (int i = index+1; i < size+1; i++) {
                result[i]=array[i-1];
            }
        }
        for(int x : result){
            System.out.print(x+"\t");
        }
    }
}
