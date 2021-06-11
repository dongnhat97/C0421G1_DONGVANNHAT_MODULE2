package _7_TruuTuong.practice;

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal element: animals) {
            System.out.println(element.makeSound());
            if (element instanceof Chicken) {
                Edible edible = ((Chicken)element);
                System.out.println(edible.howToEat());
            }
        }

        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
//
        }
    }
    }

