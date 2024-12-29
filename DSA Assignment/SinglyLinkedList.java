//Question number 1

import java.util.Scanner;

class SinglyLinkedList {
    Node head; // Reference to the head node

    // Node class to represent each element of the linked list
    class Node {
        int data; // Data of the node
        Node next; // Reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next reference as null
        }
    }

    // Method to create a singly linked list
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
            }
        }
    }

    // Method to display the linked list
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Data entered in the list are:");
        Node current = head;
        while (current != null) {
            System.out.println("Data = " + current.data);
            current = current.next;
        }
    }

    // Method to display the linked list in reverse order (recursive approach)
    public void displayReverse(Node node) {
        if (node == null) {
            return;
        }
        displayReverse(node.next); // Recurse to the end
        System.out.println("Data = " + node.data); // Print in reverse order
    }

    public void reverseDisplay() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("The list in reverse are:");
        displayReverse(head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();

        SinglyLinkedList list = new SinglyLinkedList();
        list.createList(n, sc);
        list.displayList();
        list.reverseDisplay();

        sc.close();
    }
}
