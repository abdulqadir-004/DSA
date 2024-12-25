
class myStack{
    int stack[];//initailize an array
    int capacity;//for size of array
    int top;//for stack's top position

    //get capacity using constructor
    myStack(int capacity){
        this.capacity = capacity;
        top = -1;//default set stack as empty
        stack = new int[capacity];//assign array's size
    }

    //mehtod to add elements to stack
    public void push(int data){
        //if stack is full
        if(top == capacity-1){
            System.out.println("Stack overflow");
        } else{
            top++;//update top to upper position of stack
            stack[top] = data;//add data to array/stack's top position
        }
    }

    //mehtod to remove elements from stack
    public void pop(){
        //if stack is empty already
        if(top == -1){
            System.out.println("Stack underflow");
        } else{
            top--;//reduce/downshift top
        }
    }

    //method to peek/see element from stack
    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty!");
        }
        return stack[top];//return top of stack
    }

    //method to check stack empty or not
    public boolean isEmpty(){
        return top<0; //if top is negative, stack is empty
    }

    //mehtod to show stack
    public void show(){
        for(int i = 0; i<=top; i++){
            System.out.print(stack[i]+" ");//print current element of stack with some space
        }
        System.out.println();//add new line
    }
}

public class Stack{
    public static void main(String[] args) {
        //create stack object
        myStack s =  new myStack(4); // add some size

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
        System.out.println("After poping top element");
        s.pop();
        s.show();

        //peek stack
        System.out.println("Top element of stack: "+s.peek());

         //check if stack is empty
         System.out.println("Stack is empty = "+s.isEmpty());
    }
}