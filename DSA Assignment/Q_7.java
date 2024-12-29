//Question number 7

import java.util.Scanner;

class LinkedList {
    Node head; // Reference to the head node

    // Node class to create linked list nodes
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node to the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Static method to merge two sorted linked lists
    public static LinkedList mergeSortedLists(LinkedList l1, LinkedList l2) {
        LinkedList mergedList = new LinkedList();
        Node p1 = l1.head;
        Node p2 = l2.head;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                mergedList.addLast(p1.data);
                p1 = p1.next;
            } else {
                mergedList.addLast(p2.data);
                p2 = p2.next;
            }
        }

        // Add remaining elements from l1, if any
        while (p1 != null) {
            mergedList.addLast(p1.data);
            p1 = p1.next;
        }

        // Add remaining elements from l2, if any
        while (p2 != null) {
            mergedList.addLast(p2.data);
            p2 = p2.next;
        }

        return mergedList;
    }
}

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first linked list
        LinkedList list1 = new LinkedList();
        System.out.print("Enter the number of elements in the first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of the first list in sorted order:");
        for (int i = 0; i < n1; i++) {
            list1.addLast(sc.nextInt());
        }

        // Input for second linked list
        LinkedList list2 = new LinkedList();
        System.out.print("Enter the number of elements in the second list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of the second list in sorted order:");
        for (int i = 0; i < n2; i++) {
            list2.addLast(sc.nextInt());
        }

        // Display both lists
        System.out.println("First List:");
        list1.display();
        System.out.println("Second List:");
        list2.display();

        // Merge the two sorted lists
        LinkedList mergedList = LinkedList.mergeSortedLists(list1, list2);

        // Display the merged sorted list
        System.out.println("Merged Sorted List:");
        mergedList.display();

        sc.close();
    }
}
