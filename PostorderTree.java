class Node{
    int key;
    Node left,right;

Node(int value){
    key = value;
    left=right=null;
}}
public class PostorderTree{
    public static void tree(Node root){
        if(root==null){
            return;
        }
        //postorder
      tree(root.left);
        tree(root.right);
        System.out.println(root.key);
    }
    public static void main(String[]args){
         Node root= new Node(10);
         root.left =new Node(20);
         root.right= new Node(30);
         root.left.left = new Node(40);
         root.left.right =new Node(50);
         root.right.left= new Node(60);
         root.right.right= new Node(70);
        tree(root);
    }
}