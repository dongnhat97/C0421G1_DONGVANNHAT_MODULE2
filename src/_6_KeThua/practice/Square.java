package _6_KeThua.practice;

public class Square extends Rectangle  {
    private double size = 1.0;
    public Square() {

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double width, double height, double size) {
        super(width, height);
        this.size = size;
    }

    public Square(String color, boolean filler, double width, double height, double size) {
        super(color, filler, width, height);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +" "+super.toString()+
                '}';
    }
}
