package linkedlist;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int x) {
        this.data = x;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinked {
    static Node insertAtFront(Node head, int x) {
        Node node = new Node(x);

        node.prev = null;
        node.next = head;

        if (head != null)
            head.prev = node;

        return node;
    }

    static Node insertAtEnd(Node head, int x) {
        Node current = head;

        Node node = new Node(x);

        if (head == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;

            }

            current.next = node;
            node.prev = current;

        }

        return head;
    }

    public static void main(String[] args) {
        // Create the first node (head of the list)
        Node head = new Node(10);

        // Create and link the second node
        head.next = new Node(20);
        head.next.prev = head;

        // Create and link the third node
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        // Create and link the fourth node
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

//        head = insertAtFront(head, 5);
        head = insertAtEnd(head, 50);

        // Traverse the list forward and print elements
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
    }
}
