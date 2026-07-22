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

    // ------------------------------ TRAVERSAL ------------------------------
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

    // ------------------------------ INSERTION ------------------------------
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

    // ------------------------------ DELETION ------------------------------
    public static Node deleteFirst(Node head) {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;
        temp = null;

        return head;
    }

    public static Node deleteLast(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

        return head;
    }

    public static Node deleteAtPos(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;
    }

    // ------------------------------ SEARCH ------------------------------
    public static boolean search(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static boolean searchRecursion(Node head, int key) {
        if (head == null) {
            return false;
        }

        if (head.data == key)
            return true;

        if (head.next == null)
            return false;

        return searchRecursion(head.next, key);
    }

    // ------------------------------ MIDDLE ------------------------------
    public static Node middle(Node head) {
        Node current = head;
        int count = 0;

        while (current != null) {
            current = current.next;
            count++;
        }
        System.out.println(count);
        count /= 2;

        if (count % 2 == 0)
            count++;

        current = head;
        for (int i = 0; i < count - 1; i++) {
            current = current.next;
        }

        return current;
    }


    // ------------------------------ MODIFY ------------------------------

    /**
     * Given a Singly linked list. The task is to modify the value of the first half of nodes
     * such that 1st node's new value is equal to the value of the last node minus the first node's
     * current value, 2nd node's new value is equal to the second last node's value minus 2nd nodes
     * current value, likewise for first half nodes, then replace the second half of nodes with the initial
     * values of the first half of nodes (values before modifying the nodes).
     * <p>
     * Note: If the size of it is odd then the value of the middle node remains unchanged.
     */
    public static Node modify(Node head) {


        return head;
    }

    // ------------------------------ MAIN ------------------------------
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

//        Linked.traverseListRecusrion(head);
//        head = insertAtFront(head, 1);
//        head = insertAtEnd(head, 1);
//        head = insertAtPos(head, 3, 1);
//        head = deleteFirst(head);
//        head = deleteLast(head);
//        System.out.println(search(head, 40));
//        System.out.println(searchRecursion(head, 40));
        System.out.println(middle(head).data);
//        Linked.traverseList(head);

//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
    }
}
