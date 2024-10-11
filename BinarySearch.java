import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (array[mid] == target) {
                return mid; // Target found at mid
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the num of elem in the arr: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter " + size + " elem (sorted):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Ensure the array is sorted (optional step in case input is not sorted)

     Arrays.sort(array);
     
        // Get the target value to search
        System.out.print("Enter the target value to find: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Target value " + target + " is not found in the arr.");
        } else {
            System.out.println("Target value " + target + " is found at index: " + result);
        }

        scanner.close();
    }
}