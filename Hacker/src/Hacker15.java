import java.util.Scanner;

/**
 * Created by olenag on 8/6/2017.
 */
public class Hacker15 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node insert(Node head, int data) {

        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node cur = head;
        while(cur!=null) {
            try {
                if (cur.data == cur.next.data) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next == null ? null : cur.next;
                }
                if (cur.next == null) {
                    return head;
                }
            } catch (NullPointerException e) {
                return head;
            }
        }
            return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        head=removeDuplicates(head);
        display(head);
        sc.close();
    }
}
