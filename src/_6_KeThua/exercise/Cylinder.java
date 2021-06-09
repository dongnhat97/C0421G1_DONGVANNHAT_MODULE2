package _6_KeThua.exercise;

public class Cylinder extends Circle {
    double height = 8.0;
    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAria1() {
        return getAria()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " "+super.toString()+
                '}';
    }
}
