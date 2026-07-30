package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveKthNode {

    public static Node deleteK(Node head, int k) {
        if (head == null || k <= 0)
            return head;

        Node current = head;
        Node prev = null;
        int count = 0;

        while (current != null) {
            count++;

            if (count % k == 0) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    static void printList(Node head) {

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node pairwiseSwap(Node head) {


        return head;
    }

    static int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        Node temp = slow;

        // cycle detection
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            slow = slow.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // return 0 if no cycle
        if (!cycle) return 0;

        // finding starting point
        Node current = head;
        while (current != slow) {
            slow = slow.next;
            current = current.next;
        }
        int count = 1;

        while (slow != temp) {
            slow = slow.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head;
//        head.next.next.next.next.next.next = new Node(70);
//        head.next.next.next.next.next.next.next = new Node(80);
//        head.next.next.next.next.next.next.next.next = new Node(90);
//        head.next.next.next.next.next.next.next.next.next = new Node(100);

//        deleteK(head, 3);
//        lengthOfLoop(head);
        printList(head);
    }
}