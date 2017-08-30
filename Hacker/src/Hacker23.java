import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by olenag on 8/9/2017.
 */
class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}

public class Hacker23 {
    static void levelOrder(Node23 root){
        //Write your code here
        Queue<Node23> queue = new LinkedList();
        Node23 cur;
        String s = "";

        queue.add(root);
        while (!queue.isEmpty()) {
            cur =queue.remove();
            s = s + cur.data + " ";
            if (cur.left != null) {queue.add(cur.left);}
            if (cur.right != null) {queue.add(cur.right);}
        }

        System.out.println(s);


    }


    public static Node23 insert(Node23 root,int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
