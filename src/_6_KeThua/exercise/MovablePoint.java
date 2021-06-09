package _6_KeThua.exercise;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = xSpeed;
    }
    public float[] getSpeed() {
        float[] getSpeed = new float[] {getxSpeed(),getySpeed()};
        return getSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + getX() +
                ", ySpeed=" + getY() + "  "+ Arrays.toString(getSpeed())+
                '}';
    }
    public void move() {
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}
