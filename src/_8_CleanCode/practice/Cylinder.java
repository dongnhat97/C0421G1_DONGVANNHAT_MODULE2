package _8_CleanCode.practice;

public class Cylinder {
    public static double getVolume(int radius, int height){
       double aria = getAria(radius);
       double perimeter = getPerimeter(radius);
       double volume = perimeter * height + 2 * aria;
        return volume;
    }
    public static double getAria(double radius){
        return radius*radius*Math.PI;
    }
    public static double getPerimeter(double radius) {
        return radius*2*Math.PI;
    }

    public static void main(String[] args) {


        System.out.println(getVolume(2,8));
    }
}
