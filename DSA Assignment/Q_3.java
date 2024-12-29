import java.util.Scanner;

class DoublyLinkedList {
    Node head; // Reference to the head node

    // Node class to represent each element of the doubly linked list
    class Node {
        int data; // Data of the node
        Node prev; // Reference to the previous node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.prev = null; // Initialize previous reference as null
            this.next = null; // Initialize next reference as null
        }
    }

    // Method to create a doubly linked list
    public void createList(int n, Scanner sc) {
        System.out.println("Input data for nodes:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + " : ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode; // Set the first node as head
            } else {
                Node current = head;
                while (current.next != null) { // Traverse to the last node
                    current = current.next;
                }
                current.next = newNode; // Add new node at the end
                newNode.prev = current; // Link new node's previous to the current node
            }
        }
    }

    // Method to display the doubly linked list
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Data entered in the list are:");
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Node " + index + " : " + current.data);
            current = current.next;
            index++;
        }
    }

    // Method to find the maximum value in the doubly linked list
    public int findMaxValue() {
        if (head == null) {
            System.out.println("The list is empty.");
            return Integer.MIN_VALUE;
        }
        int max = head.data; // Initialize max with the head node's data
        Node current = head.next; // Start from the second node
        while (current != null) {
            if (current.data > max) { // Update max if a larger value is found
                max = current.data;
            }
            current = current.next; // Move to the next node
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();

        DoublyLinkedList list = new DoublyLinkedList();
        list.createList(n, sc);
        list.displayList();

        int maxValue = list.findMaxValue();
        System.out.println("The Maximum Value in the Linked List : " + maxValue);

        sc.close();
    }
}
