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

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next.next = new Node(100);

        deleteK(head, 3);
        printList(head);
    }
}