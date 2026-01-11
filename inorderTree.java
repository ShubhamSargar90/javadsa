class Node {
    int key;
    Node left, right;

    Node(int value) {
        key = value;
        left = right = null;
    }
}

public class inorderTree {
    public static void tree(Node root) {
        if (root == null) {
            return;
        }
        // inorder
        tree(root.left);
        System.out.println(root.key);
        tree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        tree(root);
    }
}