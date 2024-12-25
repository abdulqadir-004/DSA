//Stack implementation using Linked List
class myStack{
    Node head;//head node as top of stack
    int size;//track size of stack

    class Node{
        int data;//elements of stack
        Node next;// Pointer variable for next node

        Node(int data) {
            this.data = data;
            this.next = null; //Currently set next reference as null
        }
    }

    public myStack() {
        head =  null;//intially head is null, stack is empty
        size = 0;//size is also 0 initially
    }

    //method to add elements to stack
    public void push(int data){
        //create a temporary node with data
        Node temp = new Node(data);

        temp.next = head;//point it to next node
        head = temp;//assign new node as head/ top of stack
        size++;//increment size of stack
    }

    //mehtod to remove elements from stack
    public void pop(){
        if(head == null){
            System.out.println("Stack underflow");
        }else{
        head = head.next; //assign next node as head, to remove current head
        size--;//decrement size of stack
        }
    }

    //method to peek stack 
    public int peek(){
        if(head == null){
            return -1;
        }
        return head.data; //show head, top of stack
    }

    //method to check is stack empty or not
    public boolean isEmpty(){
        return head == null;
    }

    //method to get size of stack
    public int size(){
        return size;
    }

    // Method to show stack
    public void show() {
        Node currentNode = head; // Pointer variable for iteration

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");//print current element of stack with some space
            currentNode = currentNode.next; // Traverse until stack is empty
        }
        System.out.println();//newline for clear results
    }
}

public class stackLL{
    public static void main(String[] args) {
       //create stack object
       myStack s =  new myStack();

       //check if stack is empty
       System.out.println("Stack is empty = "+s.isEmpty());
       
       //add some elements
       s.push(12);
       s.push(23);
       s.push(2);
       s.push(67);

       //show stack
       s.show();

       //pop element and show stack again
       System.out.println("\nAfter poping top element");
       s.pop();
       s.show();

       //peek stack
       System.out.println("\nTop element of stack: "+s.peek());

        //check if stack is empty
        System.out.println("\nStack is empty = "+s.isEmpty());
    }
}