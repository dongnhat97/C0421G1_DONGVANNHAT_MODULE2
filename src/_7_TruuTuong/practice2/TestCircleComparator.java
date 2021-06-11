package _7_TruuTuong.practice2;
import java.util.Arrays;
import java.util.Comparator;

import _5_Static.exercise.Circle;

public class TestCircleComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1);
        circles[1] = new Circle(3);
        circles[2] = new Circle(2);
        System.out.println("mang khi chua sap xep");
        for (Circle element : circles) {
            System.out.println(element);
        }
        Comparator comparator =new CircleComparator();
        Arrays.sort(circles, comparator);
        System.out.println("mang sau khi sắp xếp ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
