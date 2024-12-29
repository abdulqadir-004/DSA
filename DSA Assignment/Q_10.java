//Question number 10

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

public class Q_10{
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
