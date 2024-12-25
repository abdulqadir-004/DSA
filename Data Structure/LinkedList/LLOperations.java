import java.util.Scanner; // Import scanner class for input

class LL {
    Node head; // Create a head node

    class Node {
        int data; // Integer type data
        Node next; // Pointer variable for next node

        Node(int data) {
            this.data = data;
            this.next = null; // Initially set next node to null
        }
    }

    // Class for circular linked list's nodes
    class CircularLLNode {
        int data; // Integer type data
        CircularLLNode next; // Pointer variable for next node
        CircularLLNode prev; // Pointer variable for prev node

        CircularLLNode(int data) {
            this.data = data;
            this.next = null; // Initially set next node to null
            this.prev = null; // Initially set prev node to null
        }
    }

    CircularLLNode circularHead; // Head for circular linked list

    // Method to add node in linked list
    public void add(int data) {
        Node newNode = new Node(data); // Create a new Node
        // If there is no list
        if (head == null) {
            head = newNode; // Assign head as new Node
        } else {
            Node currentNode = head; // Pointer variable for iteration
            while (currentNode.next != null) {
                currentNode = currentNode.next; // Iterate
            }
            currentNode.next = newNode; // Add new node at last of list
        }
    }

    // Method to add Node at first of LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new Node

        // If head is null then add newNode at head
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head; // Assign newNode's next to current head
            head = newNode; // Assign newNode as head
        }
    }

    // Method to add Node at last of LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new Node

        // If head is null then add newNode at head
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head; // Pointer variable for iteration
            while (currentNode.next != null) {
                currentNode = currentNode.next; // Iterate until the last node
            }
            currentNode.next = newNode; // Add new node at current node's next
        }
    }

    // Method to remove first node from linked list
    public void removeFirst() {
        // If there is no head, show list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // If list contains only one node
        if (head.next == null) {
            head = null; // Assign head to null
            return;
        }
        // If list contains many nodes, assign 2nd node as head
        head = head.next;
    }

    // Method to remove last node from linked list
    public void removeLast() {
        // If there is no head, show list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // If list contains only one node
        if (head.next == null) {
            head = null; // Assign head to null
            return;
        }
        // If list contains many nodes
        Node last = head.next;
        Node secLast = head;
        while (last.next != null) {
            last = last.next;
            secLast = secLast.next;
        }
        secLast.next = null; // Assign secLast's next to null
    }

    // Method to reverse a linked list
    public void reverseLL() {
        Node currentNode = head; // Pointer variable for iteration
        Node prevNode = null; // Pointer variable for previous node

        while (currentNode != null) {
            Node tempNode = currentNode.next; // Create a temp node
            currentNode.next = prevNode; // Point currentNode to the previous node
            prevNode = currentNode; // Iterate previousNode to currentNode
            currentNode = tempNode; // Iterate currentNode to next node
        }
        head = prevNode; // Assign head as previous node, reversed
    }

    // Method to add in circular linked list
    public void addCircular(int data) {
        CircularLLNode newNode = new CircularLLNode(data); // Create a new CircularLLNode

        // If there's an empty list
        if (circularHead == null) {
            circularHead = newNode; // Assign newNode as head
            newNode.next = circularHead; // Point to itself
            newNode.prev = circularHead; // Point to itself
        } else {
            CircularLLNode tail = circularHead.prev; // New pointer for tail
            tail.next = newNode; // Add new node after tail
            newNode.prev = tail; // Connect newNode with tail
            newNode.next = circularHead; // Connect newNode to head
            circularHead.prev = newNode; // Assign new node as tail
        }
    }

    // Method to display circular linked list
    public void displayCircular() {
        CircularLLNode currNode = circularHead; // Pointer variable for iteration

        if (circularHead != null) { // If head is not null
            do {
                System.out.print(currNode.data + " <-> "); // Print current node value
                currNode = currNode.next; // Iterate
            } while (currNode != circularHead); // Check if current node hasn't reached head yet
            System.out.println("(head)"); // Indicate circular nature
        }
    }

    // Method to display linked list
    public void display() {
        Node currentNode = head; // Pointer variable for iteration

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> "); // Print current node
            currentNode = currentNode.next; // Traverse until currentNode's next node is null
        }
        System.out.println("null"); // Show end of linked list as null
    }
}

public class LLOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a new scanner for input
        LL list = new LL(); // create a new instance of the LL class for the normal list
        LL circularList = new LL(); // create a new instance of the LL class for the circular linked list

        // Normal Linked List Operations
        System.out.println("Normal Linked List Operations:");

        // Add some elements to the normal linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Show the normal linked list
        System.out.println("Normal Linked List:");
        list.display();

        // Show reversed normal linked list
        System.out.println("Reversed Normal Linked List:");
        list.reverseLL();
        list.display();

        // Ask which node to remove from the normal linked list
        list.reverseLL(); // reverse back to original
        System.out.println("Which node to remove from the normal linked list (1- First 2- Last):");
        int delNode = sc.nextInt();
        while (delNode < 1 || delNode > 2) {
            System.out.println("Choose only 1 or 2: ");
            delNode = sc.nextInt();
        }

        // Perform the removal based on user input
        switch (delNode) {
            case 1:
                list.removeFirst(); // Corrected method name
                break;

            case 2:
                list.removeLast(); // Corrected method name
                break;
        }

        // Show the linked list after deleting elements
        System.out.println("Linked list after deleting elements:");
        list.display();

        // Circular Linked List Operations
        System.out.println("\nCircular Linked List Operations:");

        // Add some elements to the circular linked list
        circularList.addCircular(10);
        circularList.addCircular(20);
        circularList.addCircular(30);
        circularList.addCircular(40);
        circularList.addCircular(50);

        // Display the circular linked list
        System.out.println("Circular Linked List:");
        circularList.displayCircular(); // Corrected method name
    }
}
