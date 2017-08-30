import java.util.Scanner;

/**
 * Created by olenag on 8/8/2017.
 */
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Hacker22 {

    public static int getHeight(Node root){
        int resleft = 0;
        int resright = 0;
        Node currentL, currentR, current;
        currentL = null;
        currentR = null;
        current = null;
        while ((root.left != null) || (root.right != null)) {

            if (root.left != null) {
                currentL = root.left;
                resleft++;
                current = root.right;
            } else {
                currentR = root.right;
                resright++;
                current = root.left;
            }
            root = current;
        }
/*            if (currentL.left != null) {
                currentL = currentL.right;
                resleft++;
            } else if (currentR.right != null) {
                currentR = currentR.left;
                resright++;
            }
            currentL.left = root.left;
            currentR.right = root.right;
        }*/
        //current = root;
        /*while (currentR.right != null) {
            currentR = currentR.right;
            resright++;
        }*/
        return Math.max(resleft, resright);
    }


    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
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
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }


}
