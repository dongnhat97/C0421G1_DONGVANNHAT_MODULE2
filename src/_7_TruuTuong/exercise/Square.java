package _7_TruuTuong.exercise;

import _6_KeThua.practice.Rectangle;

public class Square extends Shape implements Resizeable {
    private double size = 1.0;

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filler, double size) {
        super(color, filler);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getAria() {
        return Math.pow(this.size,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +""+super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.size=this.size*((percent+100)/100);
    }
}
