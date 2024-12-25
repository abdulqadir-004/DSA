//binary tree implementation
import java.util.Scanner;
class Node{
    Node left;//for left node
    Node right;//for right node
    int data;//for data

    public Node(int data){
        this.data = data;
    }
}

public class Tree{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //call createTree method to create a Binary Tree
        Node root = createTree();
        //print tree in order
        System.out.println("Tree in Order: ");
        inOrder(root);
        //print tree in pre order
        System.out.println("\nTree in Order: ");
        preOrder(root);
        //print tree in post order
        System.out.println("\nTree in Order: ");
        postOrder(root);
    }

    //method for creating/implementing tree
    static Node createTree(){
        Node root = null;//Initialize a node initially null
        //prompt for data
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        
        //check if data isn't null (-1)
        if(data == -1){
            return null;
        }
        //else create a new node with data
        root = new Node(data);

        //now ask for root's left and right, recursively
        System.out.println("Enter Left for "+data);
        root.left = createTree();//recursive call

        System.out.println("Enter Right for "+data);
        root.right = createTree();

        return root;
    }

    //method to print tree in Order "L N R" left node right
    static void inOrder(Node root){
        if(root == null){
            return;
        }

        //recursive call for left node
        inOrder(root.left);
        System.out.print(root.data + " ");//print data, left most node
        //recursive call for right node
        inOrder(root.right);
    }

    //method to print tree in pre Order "N L R" node left right
    static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");//print data
        //recursive call for left node
        preOrder(root.left);
        //recursive call for right node
        preOrder(root.right);
    }

    //method to print tree in post Order "N L R" node left right
    static void postOrder(Node root){
        if(root == null){
            return;
        }

        //recursive call for left node
        postOrder(root.left);
        //recursive call for right node
        postOrder(root.right);
        System.out.print(root.data + " ");//print data
    }
}
/*
1- createTree():- so i made a node class with left and right node, made a integer type data type for node's data;
In main class i created a static method to create a binary tree, in that method initially i just created an empty node, asked user for data, checked if it's null
or not if yes then it'll stop at that position that means the recursion call is ended, then asked for left and right for the node recursively.
the process will go on untill user puts "-1" in both left and right node/child nodes, when it's finally done for left nodes means left for last most node is "-1",
then it'll ask for right of that node if right isn't null it'll recursively call the create tree function again, if right of that node is null too then it'll automatically 
go to previous/parent node for it's right- this process is recursive and will go on-

2- i created a method to print the binary tree in "left, node, right" order also known as inOrder. at first i checked if the root is null, if yes simple return, and if not
recursive call the inOrder function and pass the root's left as parameter, it will go continuously untill node/root's left isn'nt null, then it'll print the left most node.
Then it'll go for that left most node's right in "ln 55", and same thing goes for right too-
*/