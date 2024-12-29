//implementing queue using array
class myQueue{
    int queue[] = new int[5];//queue array
    int front;//pointer for front
    int rear;//pointer for rear
    int size;//queue size tracker (tracks number of elements)

    //method to add elements in queue
    public void enQueue(int data){
        //queue overflow check
        if(size == queue.length){ //if queue array's length is equal to number of elements in queue
            System.out.println("Queue overflow can not add "+data);
            return;//to prevent overflow adding elements
        }
        queue[rear] = data;//insert data at last or queue
        rear = (rear + 1) % queue.length;//increment rear cicularly 
        size++;//increment size
    }

    //method to remove elements from queue
    public int deQueue(){
        //queue underflow check
        if(size == 0){
            System.out.println("Queue underflow can not remove elements from queue");
            return -1;
        }
        int res = queue[front];//remove the front element/first element
        front = (front + 1) % queue.length;//increment front cicularly 
        size--;//decrement size
        return res;
    }

    //method to show queue
    public void show(){
        System.out.print("Queue: ");
        for(int i = 0; i<size; i++){
            System.out.print(queue[(front + i) % queue.length]+ " ");//print element start from front pointer using circular indexing
        }
        System.out.println();//for newline
        //to print array elements
        System.out.print("Array: ");
        for(int n : queue){
            System.out.print(n+ " ");
        }
    }
}

public class Q_8{
    public static void main(String[] args) {
        //make object of queue
        myQueue q = new myQueue();

        //try to remove when empty queue
        q.deQueue();
        System.out.println();//for clear output

        //add some elements to queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        //show queue
        q.show();
        System.out.println();//for clear output

        //rome some elements and show
        System.out.println("\nQeueue after removing elements: ");
        q.deQueue();
        q.show();


        //try to add elements cicularly
        q.enQueue(6);
        System.out.println("\n");//for clear output
        q.show();

        //try adding elements when queue is full (it'll show error)
        System.out.println("\n");//for clear output
        q.enQueue(8);
        q.show();
    }
}
