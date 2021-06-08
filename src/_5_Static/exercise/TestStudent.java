package _5_Static.exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setClass1("C04");
        student1.setName("Dong Nhat");
        System.out.println(student1.getClass1());
        System.out.println(student1.getName());
    }
}
