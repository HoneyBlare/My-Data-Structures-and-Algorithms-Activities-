import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 10, 8, 1, 9, 18};

        // Selection sort
        for (int aella = 0; aella < arr.length - 1; ++aella) {
            int minIndex = aella;

            // Find minimum index
            for (int j = aella + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[aella];
            arr[aella] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
