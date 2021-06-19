package _10_List.exercise;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>(10);
        myList.add("Nhật ");
        myList.add("Ha");
        myList.add("Diep");
        myList.add("Chien");
        myList.add("Phuc");
        myList.add(2,"chen");
        System.out.println("Before remove");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println("After remove");
        myList.remove(2);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
    }
}
