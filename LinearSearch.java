import java.util.Scanner;

public class LinearSearch {

    // 1.Function to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // 2. Return the index
            }
        }
        return -1; // 3. not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //4. Get the size of the array from the user
        System.out.print("Enter the num of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // 5. ngayuh siya array  elememt sa user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Get the target value to search
        System.out.print("Enter the target value to find: ");
        int target = scanner.nextInt();
        
        // Perform linear search
        int result = linearSearch(array, target);
        
        // Output the result
        if (result == -1) {
            System.out.println("Target value " + target + " is not found in the array.");
        } else {
            System.out.println("Target value " + target + " is found at index: " + result);
        }

        scanner.close();
    }
}

