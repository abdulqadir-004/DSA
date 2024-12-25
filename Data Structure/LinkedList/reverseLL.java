class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new node to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Reverse the linked list
    public void reverseLL() {
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            Node tempNode = currentNode.next; // Store the next node
            currentNode.next = prevNode; // Reverse the link
            prevNode = currentNode; // Move prevNode to the current node
            currentNode = tempNode; // Move to the next node
        }
        head = prevNode; // Update head to the new front of the list
    }

    // Display the linked list
    public void display() {
        Node current = head; // Start from the head by assigning a reference variable named current
        while (current != null) {
            System.out.print(current.data + " -> "); // Print data of current node
            current = current.next; // Move current to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }
}

public class reverseLL {
    public static void main(String[] args) {
        LL list = new LL();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Show original list
        System.out.println("Original list:");
        list.display();

        // Reverse the list
        list.reverseLL();

        // Show reversed list
        System.out.println("Reversed list:");
        list.display();
    }
}