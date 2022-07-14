class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
public class PreOrder {
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        preorder(root);
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);


        }
    }
}
