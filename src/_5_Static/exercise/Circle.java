package _5_Static.exercise;

public class Circle {
    private double radius = 1.0 ;
    private String color= "blue";
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
