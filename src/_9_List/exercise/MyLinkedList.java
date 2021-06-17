package _9_List.exercise;

public class MyLinkedList {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add(int index , Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i<index-1 &&temp.next!=null;i++) {
                temp = temp.next;
        }
         holder = temp.next;
        temp.next = new Node(data);

    }
}
