public class CLL {
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node; // Corrected: head must be the new node
            tail = node;
            node.next = head; // Essential for circularity
            return;
        }

        tail.next = node;
        node.next = head; // New node points back to head
        tail = node;      // Update tail to the new node
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> "); // Used print instead of println for better visualization
                node = node.next;
            } while (node != head);
            System.out.println("HEAD (back to start)");
        } else {
            System.out.println("The list is empty.");
        }
    }
}

class CircularLinkedList {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
    }
}