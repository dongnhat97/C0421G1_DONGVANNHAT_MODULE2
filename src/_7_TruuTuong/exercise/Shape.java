package _7_TruuTuong.exercise;

public class Shape {
    private String color = "green";
    private boolean filler = true;
    public Shape(){

    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                 + getColor() + '\'' +
                ", filler=" + isFiller() +
                '}';
    }
}
