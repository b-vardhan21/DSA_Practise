import java.util.Scanner; 
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }

}

public class PrintNodeAtKDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance value");
        int x = sc.nextInt(); 
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);
        root.left.right = new Node(60);

        printkdist(root, x);
    }
    public static void printkdist(Node root, int x){
        if(root == null) return;
        if(x == 0){
            System.out.println(root.key+" ");
        }
        else{
            printkdist(root.left, x-1);
            printkdist(root.right, x-1);
        }
    }
}
