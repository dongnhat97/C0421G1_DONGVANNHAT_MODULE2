package _6_KeThua.exercise;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D.setXYZ(5,6,7);
        System.out.println(point3D);
        point3D = new Point3D(2,5,6);
        System.out.println(point3D);
    }
}
