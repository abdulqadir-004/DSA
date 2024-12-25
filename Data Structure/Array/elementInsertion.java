import java.util.Scanner; //imported utility for Scanner class
public class elementInsertion{
    public static void main(String[] args) {
        //initialize scanner for input
        Scanner sc = new Scanner(System.in);

        //initialize an array with default values 0
        int arr[] = {0, 0, 0, 0, 0};

        //initialize a pos variable for input of position
        int pos;
        
        //initalize a num variable for input of number/value
        int num;

        //show size of array on console
        System.out.println("array's size is: "+arr.length);

        //ask for position
        System.out.print("where do you want to add value: ");
        pos = sc.nextInt();

        //ask for the value
        System.out.print("enter your value: ");
        num = sc.nextInt();
        
        //show original array
        System.out.println("original array is: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //input value at desired position
        arr[pos-1] = num;

        //show new values of Array
        System.out.println("arrays contains following values: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //close scanner
        sc.close();
    }
}