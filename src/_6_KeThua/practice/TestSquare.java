package _6_KeThua.practice;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(90);
        System.out.println(square);
//        square.setSide(10);
        square.setWidth(90);
        square.setHeight(90);
//        square = new Square("blue",true,8.0);
        System.out.println(square);
        System.out.println(square.getAria());

    }
}
