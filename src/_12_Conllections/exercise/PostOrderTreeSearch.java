package _12_Conllections.exercise;

public class PostOrderTreeSearch {
    private class Node {
        private  int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    private Node root;

    public PostOrderTreeSearch() {
        this.root = null;
    }
//    private Node insertRec(Node root,int value) {
//        if (root == null) {
//            root = new Node(value);
//        }
//    }
}
