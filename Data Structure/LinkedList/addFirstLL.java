import java.util.Scanner; //import java utilities for scanner class
class LL {
    Node head; // Reference to head node

    // Make a node class to create nodes
    class Node {
        String data; // Data of node
        Node next; // Reference of next node 

        Node(String data) {
            this.data = data;
            this.next = null; // Currently set next reference as null
        }
    }

    // Method to add new nodes at the first position of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node with data as parameter

        // Check if there's already an existing linked list, if yes then add data
        if (head == null) {
            head = newNode;
            return;
        }

        /* If there's already an existing linked list then move the current head and add new node to that place..
        simplified just point new node's next reference to current head and add new node to current head's position */
        newNode.next = head;
        head = newNode;
    }

    //Method to add new nodes at the last position of the linked list
    public void addLast(String data){
        Node newNode = new Node(data); // Create a new node with data as parameter

        // Check if there's already an existing linked list, if yes then add data
        if (head == null) {
            head = newNode;
            return;
        }

        /*if there's already an existing linkedlist then create a current variable as refrencing variable..
        update current to next untill it encounters null, if null is encountered then add new node at current position */
        Node current = head; //start from head
        while(current.next != null){ //check from head if current's next is null
            current = current.next; //move current to next node
        }
        current.next = newNode; //assign current's next to new node
    }

    //mehtod to delete first node
    public void delFirst(){
        //if there's only single node in list
        if(head.next == null){
            head = null; //set head to null
        }

        //if there's more nodes in linkedlist
        head = head.next; //set head's next to head, it'll break the current head node from the linkedlist
    }

    //method to delete last node
    public void delLast(){
        //check if list isnt empty
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        //if there's only one node in list
        if(head.next == null){
            head = null; //set head to null
        }
        
        //create a refrence for last and second last node
        Node lastNode = head.next;
        Node secLast = head;

        //traverse until last node's next is null
        while(lastNode.next != null){
            //update & traverse
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null; //simply set second last node's next to null, it'll unchain the last node
    }

    // Method to display the linked list
    public void display() {
        Node current = head; // Start from the head by assigning a refrence variable named current
        while (current != null) { 
            System.out.print(current.data + " -> "); // Print data of current node
            current = current.next; // Move current to the next node
        }
        System.out.println("null"); // Indicate end of the list
    }
}

public class addFirstLL {
    public static void main(String[] args) {
        //make an object of scanner class for input
        Scanner sc = new Scanner(System.in);
    
        // Make an object of LL class to create a linked list
        LL list = new LL();

        // Add some data at first position of list
        list.addFirst("LinkedList");
        list.addFirst("of");
        list.addFirst("example");
        list.addFirst("is");
        list.addFirst("this");

        // Display linked list after adding at first position
        System.out.println("Linked list after adding elements at first position: ");
        list.display();

        //add some data at end of list
        list.addLast("Data");
        list.addLast("at");
        list.addLast("End");

        //newline for clear result
        System.out.println();

        //Display linked list after adding at last position
        System.out.println("Linked list after adding elements at last position: ");
        list.display();

        //newline for clear result
        System.out.println();

        //ask user which node to delete
        System.out.print("Which node do you want to delete (1- First Node 2- last Node): ");
        int delNode = sc.nextInt();
        while(delNode < 1 || delNode > 2){
            System.out.println("choose only 1 or 2: ");
        }

        switch(delNode){
            case 1:
            list.delFirst();
            break;

            case 2:
            list.delLast();
            break;
        }
        //newline for clear result
        System.out.println();
        
        //show linked list after deleting elements
        System.out.println("Linked list after deleting elements: ");
        list.display();
    }
}
