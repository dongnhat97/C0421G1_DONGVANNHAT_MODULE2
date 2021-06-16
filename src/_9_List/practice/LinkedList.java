package _9_List.practice;
import java.util.Arrays;
public class LinkedList {
    private Node head;
    private int numbNodes;
    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public LinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index,Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0 ; i < index-1 && temp.next!=null;i++) {

        }

    }
}
