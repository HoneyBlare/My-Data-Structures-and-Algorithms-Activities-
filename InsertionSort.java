import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 1, 9, 3};

        // Insertion sort
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int whatIf = i - 1;

            // Shift elements to the right
            while (whatIf >= 0 && arr[whatIf] > key) {
                arr[whatIf + 1] = arr[whatIf];
                --whatIf;
            }

            // Insert the key
            arr[whatIf + 1] = key;
        }

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
Sent
Write to Eros Dan
