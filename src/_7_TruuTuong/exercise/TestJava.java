package _7_TruuTuong.exercise;

public class TestJava {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(6.0,8.0);
        shapes[2] = new Square(7);
        System.out.println("khi chua tang kick thuoc");
        for (Shape element: shapes) {
            System.out.println(element);
        }

        ((Circle)shapes[0]).resize(Math.random()*100);
        System.out.println("new value 0 "+shapes[0]);
        System.out.println("dien tich sau khi tang"+((Circle)shapes[0]).getArea());
        ((Rectangle)shapes[1]).resize(Math.random()*100);
        System.out.println("new value 1" +shapes[1]);
        System.out.println("dien tich hinh chu nhat sau khi tang"+((Rectangle)shapes[1]).getAria());
        ((Square)shapes[2]).resize(Math.random()*100);
        System.out.println("new value2");
        System.out.println("die tich hinh vuong sau khi tang "+((Square)shapes[2]).getAria());

    }
}
