import java.util.Scanner;

public class Q_5 {
    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Current element to be placed
            int j = i - 1;

            // Move elements that are greater than `key` one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Place the key at its correct position
        }
    }

    // Method to display the array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        displayArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        System.out.println("Sorted array:");
        displayArray(arr);

        sc.close();
    }
}
