//Question number 4

import java.util.Scanner;

class CircularLinkedList {
    Node head; // Reference to the head node

    // Node class to represent each element of the circular linked list
    class Node {
        int data; // Data of the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next reference as null
        }
    }

    // Method to create a circular linked list
    public void createList(int n, Scanner sc) {
        System.out.println("Input data for nodes:");
        Node last = null; // Reference to the last node
        for (int i = 1; i <= n; i++) {
            System.out.print("Input data for node " + i + " : ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode; // Set the first node as head
                head.next = head; // Make it circular by pointing to itself
                last = head; // Initialize last as head
            } else {
                last.next = newNode; // Link last node's next to new node
                newNode.next = head; // Make it circular by linking new node's next to head
                last = newNode; // Update last to the new node
            }
        }
    }

    // Method to display the circular linked list
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Data entered in the list are:");
        Node current = head;
        int index = 1;
        do {
            System.out.println("Node " + index + " : " + current.data);
            current = current.next;
            index++;
        } while (current != head); // Traverse until we reach the head again
    }

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
            head.next = head; // Make it circular
        } else {
            Node last = head;
            while (last.next != head) { // Traverse to find the last node
                last = last.next;
            }
            newNode.next = head; // Point new node's next to the current head
            last.next = newNode; // Update last node's next to the new node
            head = newNode; // Update head to the new node
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularLinkedList list = new CircularLinkedList();

        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();
        list.createList(n, sc);

        System.out.println("Data entered in the list are:");
        list.displayList();

        System.out.print("Input data to be inserted at the beginning : ");
        int newData = sc.nextInt();
        list.insertAtBeginning(newData);

        System.out.println("After insertion, the new list is:");
        list.displayList();

        sc.close();
    }
}
