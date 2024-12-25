public class minMaxOfArray{
    public static void main(String[] args) {
        //initialize array with elements
        int arr[] = {5, 8, 1, 0, 12};

        //initialize min and max as array's first element
        int min = arr[0];
        int max = arr[0];

        //using for loop find the min and max
        for(int i = 1; i < arr.length; i++){
             //check if current value is less than min vlaue
            if(arr[i] < min){
                min = arr[i]; //replace if less
            }
            //check if current value is greater than max vlaue
            if(arr[i] > max){
                max = arr[i]; //replace if greater
            }
        }
        //show min and max of console
        System.out.println("Min: "+min+"\n"+"Max: "+max);
    }
}