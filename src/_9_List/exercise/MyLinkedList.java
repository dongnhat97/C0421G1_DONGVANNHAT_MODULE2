package _9_List.exercise;

public class MyLinkedList<E> {
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
    public void add(int index , E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i<index-1 &&temp.next!=null;i++) {
                temp = temp.next;
        }
         holder = temp.next;
        temp.next = new Node(element);
        holder = temp.next.next;
        numNodes++;
    }
    public void addFirst(E element) {
         Node temp = head;
         head = new Node(element);
         temp = head.next;
          numNodes++;
    }
    public void addLast(E element) {
          Node temp = head ;
          while (temp.next!=null) {
              temp=temp.next;
          }
          temp.next = new Node(element);
          numNodes++;
    }
    public E remove(int index) {
        Node temp = head;
        Object data;
        if (index<0||index >numNodes) {
            throw new IndexOutOfBoundsException("error index "+index);
        }if (index==0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for (int i = 0 ; i< index-1&&temp.next!=null;i++) {
                temp = temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;

    }
    public boolean
}
