import java.util.*;
import java.io.*;
import java.lang.*;
class Node{
    int key;
    Node left;
    Node right;

    Node(int k){
        key = k;
    }
}
public class levelOrderTraversal {
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        printLevel(root);

    }

    public static void printLevel(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.poll();
            System.out.println(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    
}