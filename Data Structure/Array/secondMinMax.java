public class secondMinMax {
    public static void main(String[] args) {
        // Initialize array with elements
        int arr[] = {12, 34, 1, 0, 5, 8};

        // Initialize min and max to the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Initialize secMin and secMax with maximum and minimum possible values
        int secMin = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;

        // Find the min and max values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Replace if less
            }
            if (arr[i] > max) {
                max = arr[i]; // Replace if greater
            }
        }

        // Show min and max on the console
        System.out.println("Min: " + min + "\n" + "Max: " + max);

        // Find the second min and max values
        for (int i = 0; i < arr.length; i++) {
            // Check if current value is less than secMin and not equal to min value
            if (arr[i] < secMin && arr[i] != min) {
                secMin = arr[i]; // Replace if less
            }
            // Check if current value is greater than secMax and not equal to max value
            if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i]; // Replace if greater
            }
        }

        // Show second min and max on the console
        System.out.println("Second Min: " + secMin + "\n" + "Second Max: " + secMax);
    }
}
