package _5_Static.practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mecedes","skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2= new Car("audi","skyactv 6");
        System.out.println(Car.numberOfCars);
    }
}
