package _10_List.exercise;

public class TestLinked {
    public static void main(String[] args) {
        MyLinkedList<String> animals = new MyLinkedList<>();
        // Thêm phần tử vào List
        animals.addFirst("Chó");
        animals.addFirst("Mèo");
        animals.addLast("Gà");
        animals.add(1, "Chuột");
        // Hiển thị
        for (int i = 0; i < animals.size(); i++) {
            String animal = (String)animals.get(i);
            System.out.println(animal.toString());
        }
        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());
        // Clear list
        animals.clear();
        System.out.println("List sau khi clear: ");
        for (int i = 0; i < animals.size(); i++) {
            String animal = (String)animals.get(i);
            System.out.println(animal.toString());
        }
        System.out.println("Size: " + animals.size());
    }
}
