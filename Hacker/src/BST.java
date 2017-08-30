/**
 * Created by olenag on 8/8/2017.
 */
public class BST {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

        void add(int data) {
            if (data > this.data) {
                if (this.right == null) {
                    this.right = new Node(data);
                } else {
                    this.right.add(data);
                }
            } else {
                if (this.left == null) {
                    this.left = new Node(data);
                } else {
                    this.left.add(data);
                }
            }
        }
    }

    public static Node build(int[] input) {
        Node root = new Node(input[0]);
        for (int i = 1; i < input.length; i++) {
            root.add(input[i]);
        }
        return root;
    }

    public static int height(Node root) {
        int leftHeight = root.left == null ? -1 : height(root.left);
        int rightHeight = root.right == null ? -1 : height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        /*
                   7
                  /
                 3
                / \
               2   5
              /
             1
         */
        Node root = build(new int[] {7, 3, 5, 2, 1});
        System.out.println(height(root));
    }
}
