import java.util.LinkedList;
import java.util.Queue;
public class implementation {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void display(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
    public static int level(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    private static void LevelOrder(Node root){
        if(root==null) return;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.data+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
     private static void LevelOrderLineByLine(Node root){
        if(root==null) return;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node front = q.remove();
                System.out.print(front.data+" ");
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            System.out.println();
        }
    }

    


    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(level(root));

        display(root);
            LevelOrder(root);
            LevelOrderLineByLine(root);
    }
}