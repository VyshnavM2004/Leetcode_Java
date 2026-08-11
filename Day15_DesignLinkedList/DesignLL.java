public class DesignLL {

    static class MyLinkedList {


        class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        Node head;
        Node tail;

        // Constructor
        public MyLinkedList() {
            head = null;
            tail = null;
        }

        // Get value at index
        public int get(int index) {

            if (head == null || index < 0) {
                return -1;
            }

            Node temp = head;

            for (int i = 0; i < index; i++) {

                if (temp == null) {
                    return -1;
                }

                temp = temp.next;
            }

            if (temp == null) {
                return -1;
            }

            return temp.val;
        }

        // Add node at head
        public void addAtHead(int val) {

            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Add node at tail
        public void addAtTail(int val) {

            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Add node at given index
        public void addAtIndex(int index, int val) {

            if (index < 0) {
                return;
            }

            // Add at beginning
            if (index == 0) {
                addAtHead(val);
                return;
            }

            Node temp = head;

            // Move to node before target index
            for (int i = 0; i < index - 1; i++) {

                if (temp == null) {
                    return;
                }

                temp = temp.next;
            }

            // Index is greater than list length
            if (temp == null) {
                return;
            }

            Node newNode = new Node(val);

            newNode.next = temp.next;
            temp.next = newNode;

            // If added at the end
            if (newNode.next == null) {
                tail = newNode;
            }
        }

        // Delete node at given index
        public void deleteAtIndex(int index) {

            if (head == null || index < 0) {
                return;
            }

            // Delete first node
            if (index == 0) {

                head = head.next;

                // List became empty
                if (head == null) {
                    tail = null;
                }

                return;
            }

            Node temp = head;

            // Move to node before the target
            for (int i = 0; i < index - 1; i++) {

                if (temp == null || temp.next == null) {
                    return;
                }

                temp = temp.next;
            }

            // Target doesn't exist
            if (temp.next == null) {
                return;
            }

            // Delete target node
            temp.next = temp.next.next;

            // If last node was deleted
            if (temp.next == null) {
                tail = temp;
            }
        }

        // Display linked list
        public void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }


    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        // Add at head
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);

        System.out.println("After addAtHead:");
        list.display();

        // Add at tail
        list.addAtTail(40);
        list.addAtTail(50);

        System.out.println("After addAtTail:");
        list.display();

        // Get
        System.out.println("Value at index 2: " + list.get(2));

        // Add at index
        list.addAtIndex(2, 25);

        System.out.println("After addAtIndex(2, 25):");
        list.display();

        // Delete at index
        list.deleteAtIndex(2);

        System.out.println("After deleteAtIndex(2):");
        list.display();

        // Delete first
        list.deleteAtIndex(0);

        System.out.println("After deleteAtIndex(0):");
        list.display();

        // Delete last
        list.deleteAtIndex(3);

        System.out.println("After deleteAtIndex(3):");
        list.display();
    }
}