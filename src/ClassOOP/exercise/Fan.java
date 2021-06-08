package ClassOOP.exercise;

import java.util.Scanner;

public class Fan {
    static Scanner sc = new Scanner(System.in);
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed,boolean isOn,double radius,String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius= radius;
        this.color= color;

    }
    int getSpeed() {
        return this.speed;
    }
    double getRadius() {
        return this.radius;
    }
    String getColor() {
        return this.color;
    }
    void turnOn() {
        if (this.isOn) {
            System.out.println("quat dang bat roi ma");
        }else {
            this.isOn = true;
            System.out.println("da bat quat");
        }
    }
    void turOff() {
        if (this.isOn) {
            this.isOn =false;
        }
    }
    void setSpeed(int newSpeed) {
        if (this.isOn) {
            this.speed = newSpeed;
        }else {
            System.out.println("Vui long bat quat");
            System.out.println("1: bat quat\n"+
                    "2 huy bo\n");
            int choice = sc.nextInt();
            if (choice==1) {
                turnOn();
                System.out.println("quat da bat\n"+"chon che do: 1 Slow\n"+" 2 Medium\n"+" 3 Fast\n");
                int speed = sc.nextInt();
                switch (speed) {
                    case 1:
                       setSpeed(SLOW);
                       break;
                    case 2:
                        setSpeed(MEDIUM);
                        break;
                    case 3:
                        setSpeed(FAST);
                    default:
                        System.out.println("vuot qua gioi han");
                }
            }else if (choice==2) {
                System.out.println("quat khong chay");
            }
        }

    }
    @Override
    public String toString() {
        if (this.isOn) {
            return "Fan {" + "Speed = " + speed + "\t Color = " + color + "\t Radius = " + radius + "\t Fan is ON" + "}";
        } else {
            return "Fan {" + "Color = " + color + "\t Radius = " + radius + "\t Fan is OFF" + "}";
        }
    }

//    public static void main(String[] args) {
//        System.out.println( new Fan().toString());
//        System.out.println("Fan1");
//        Fan fan1 = new Fan(Fan.FAST,)
//    }

}
