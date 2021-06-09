package _6_KeThua.exercise;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.setHeight(9.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0,"red",10.0);
        System.out.println(cylinder.getAria1());
    }
}
