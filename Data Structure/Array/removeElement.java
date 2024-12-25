import java.util.Scanner; //imported utility for scanner class
public class removeElement {
    public static void main(String[] args) {
        //initialize scanner for inpur
        Scanner sc = new Scanner(System.in);

        //initialize an array with some elements
        int arr[] = {3, 5, 9, 0, 12};

        //intialize num to remove desired element
        int num;

        //show original array
        System.out.println("original array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //ask for element to be removed
        System.out.print("which element to remove: ");
        num = sc.nextInt();

        //check for element in original array and remove it
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                
            }
        }

        //show updated array
        System.out.println("updated array: ");
        
    }
}
