package _7_TruuTuong.exercise2;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5.0);
        shapes[1] = new Rectangle(6.0,7.5);
        shapes[2] = new Circle(3.5);
        System.out.println("Aria "+((Circle)shapes[2]).getArea());
        System.out.println("Aria "+((Rectangle)shapes[1]).getAria());
        System.out.println("Aria "+((Square)shapes[0]).getAria());

        for (int i = 0 ; i<shapes.length;i++) {
            if (shapes[i] instanceof Colorable) {
                System.out.println("it is Square ");
                ((Colorable)shapes[i]).howToColor();
            }
        }
    }
}
