package _7_TruuTuong.exercise;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filler, double width, double height) {
        super(color, filler);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAria() {
        return this.height*this.width;
    }
    public double getPerimeter() {
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width=this.width*((percent+100)/100);
        this.height=this.height*((percent+100)/100);
    }
}


