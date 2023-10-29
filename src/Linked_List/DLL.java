package Linked_List;

public class DLL {

    private Node head;

    private Node prev;

    private int size;

    public DLL() {
        size = 0;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;

        size++;
    }

    public Node find(int val) {
        Node node = head;

        while (node != null) {
            if (node.val == val){
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public void insert(int after, int val) {

        Node get = find(after);

        if (get == null) {
            System.out.println("Do not exists");
            return;
        }

        Node node = new Node(val);
        node.next = get.next;
        get.next = node;
        node.prev = get;

        if (node.next!=null) {
            node.next.prev = get;
        }
        size++;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END");
        System.out.println();

        System.out.println("Printing in Reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("START");
        System.out.println();
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }


    }
}
