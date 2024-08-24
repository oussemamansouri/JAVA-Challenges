public class Solution {

    // Method to sort an array using insertion sort
    public static int[] insertionSort(int[] array) {
        // Iterate over each element of the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; // Store the current element as the key
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than the key, to one position ahead
            // of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key; // Place the key in its correct position
        }
        return array; // Return the sorted array
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        // Sort the array using insertionSort method
        int[] sortedArray = insertionSort(array);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}

