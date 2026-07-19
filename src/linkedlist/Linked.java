package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked {
    public static void traverseList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void traverseListRecusrion(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);

        if (head.next != null) {
            traverseListRecusrion(head.next);
        }

    }

    public static Node insertAtFront(Node head, int x) {
        Node n = new Node(x);
        n.next = head;

        return n;
    }

    public static Node insertAtEnd(Node head, int x) {
        Node n = new Node(x);

        if (head == null)
            return n;

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = n;
        return head;

    }

    public static Node insertAtPos(Node head, int pos, int val) {
        if (pos < 1)
            return head;

        Node n = new Node(val);

        if (head == null) {
            return n;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        n.next = temp.next;
        temp.next = n;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

//        Linked.traverseListRecusrion(head);
//        head = insertAtFront(head, 1);
//        head = insertAtEnd(head, 1);
//        head = insertAtPos(head, 3, 1);
        Linked.traverseList(head);
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
    }
}
