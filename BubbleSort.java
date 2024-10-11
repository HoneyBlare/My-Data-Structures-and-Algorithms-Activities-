import java.util.Scanner;

public class BubbleSort {
    
    // Function to perform bubleshort
    //Static method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // loop
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Compare adjacent elements
            for (int k = 0; k < n - i - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k+ 1] = temp;
                    swapped = true;
                }
            }
            // If no 2 elements were swapped, the array are sorted
            if (!swapped)
                break;
        }
    }
    
    // Function to print an array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input  size of array
        System.out.print("Enter the num of elements in the arr: ");
        int n = sc.nextInt();
        
        // Input elements of array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Original array
        System.out.println("Original arr:");
        printArray(arr);
        
        // Sorting  array
        bubbleSort(arr);
        
        // Sorted array
        System.out.println("Sorted arr ( In Ascending Order):");
        printArray(arr);
        
        sc.close();
    }
}

