class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}
public class PostOrder {
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        postorder(root);
    }
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.key);


        }
    }
}