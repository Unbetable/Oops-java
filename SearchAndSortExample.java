import java.util.Arrays;

public class SearchAndSortExample {

    public static void main(String[] args) {
        // Static array with elements
        int[] array = { 10, 5, 8, 3, 7, 2 };

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Perform linear search
        int target = 7;
        int linearSearchResult = linearSearch(array, target);

        // Output the linear search result
        if (linearSearchResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearSearchResult);
        } else {
            System.out.println("Linear Search: Element not found in the array.");
        }

        // Sort the array
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
