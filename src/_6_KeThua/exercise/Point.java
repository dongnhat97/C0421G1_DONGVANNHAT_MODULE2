package _6_KeThua.exercise;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y) {
        this.x=x;
        this.y=y;
    }
    public float[] getXY() {
        float[] getXY = new float[2];
        getXY[0] = this.x;
        getXY[1] = this.y;
        return getXY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +" "+ Arrays.toString(getXY())+
                '}';
    }
}
