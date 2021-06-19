package _11_Stack_Queue.practice;

public class GenericStackClient {
    public static void main(String[] args) {
//        System.out.println("stack of intergers");
//        stackOfIntegers();
        System.out.println("stack of String");
        stackOfStrings();
    }
    private static void stackOfStrings() {
        MyGenericStack<String> element = new MyGenericStack<>();
        element.push("Nhat");
        element.push("Diep");
        element.push("Ha");
        element.push("Chien");
        element.push("Tai");
        System.out.println("size of element : "+element.size());
        while (!element.isEmpty()) {
            System.out.println("phan tu xoa : "+element.pop());
        }
        System.out.println("size sau khi xoas phan tu :" +element.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> element = new MyGenericStack();
        element.push(5);
        element.push(4);
        element.push(3);
        element.push(2);
        element.push(1);
        System.out.println("2.1. Size of stack after push operations: " + element.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!element.isEmpty()) {
            System.out.printf(" %d", element.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + element.size());
    }
    
}
