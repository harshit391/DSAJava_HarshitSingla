package Linked_List;

public class CLL {
    private class Node{
        int val;

        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }



    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        if (head.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node idx = head;
        while (idx.next.val != val) {
            idx = idx.next;
        }

        idx.next = idx.next.next;

    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.print("HEAD");
            System.out.println();
        }

    }
    private Node head;
    private Node tail;
}
