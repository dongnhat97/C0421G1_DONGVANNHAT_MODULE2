package _7_TruuTuong.practice;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cluck cluck";
    }

    @Override
    public String howToEat() {
        return "mlem mlem";
    }
}
