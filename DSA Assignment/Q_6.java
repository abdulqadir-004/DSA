//Question number 6

import java.util.Scanner;

public class Q_6 {
    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the subarrays
            quickSort(arr, low, pivotIndex - 1); // Sort left subarray
            quickSort(arr, pivotIndex + 1, high); // Sort right subarray
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Select the last element as pivot
        int i = low - 1; // Index for smaller elements

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
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

        // Perform quick sort
        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        displayArray(arr);

        sc.close();
    }
}
