import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution26 {

    // Method to merge two sorted arrays into a single sorted array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Check if the input arrays are sorted
        if (!isSorted(arr1) || !isSorted(arr2)) {
            throw new IllegalArgumentException("The arrays must be sorted to merge.");
        }

        // Check for duplicates in the input arrays
        if (containsDuplicates(arr1) || containsDuplicates(arr2)) {
            throw new IllegalArgumentException("The arrays must not contain duplicates.");
        }

        int m = arr1.length, n = arr2.length;
        int mergedSize = calculateMergedSize(arr1, arr2);
        int[] mergedArray = new int[mergedSize];
        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    // Method to check if an array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate the size of the merged array
    static int calculateMergedSize(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int mergedSize = m + n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    mergedSize--;
                }
            }
        }
        return mergedSize;
    }

    // Method to check if an array contains duplicates
    private static boolean containsDuplicates(int[] array) {
        Set<Integer> elements = new HashSet<>();
        for (int element : array) {
            if (!elements.add(element)) {
                return true;
            }
        }
        return false;
    }

    // Main method to test the mergeArrays method
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Merge the two arrays
        int[] result = mergeArrays(arr1, arr2);

        // Print the result
        System.out.println("Result: " + Arrays.toString(result));
    }
}
