import java.util.HashSet;

public class Solution {

    // Method to determine if arr2 is a subset of arr1
    public static boolean isSubset(int[] arr1, int[] arr2) {
        
        // Create a HashSet to store elements of arr1
        HashSet<Integer> data = new HashSet<Integer>(); 

        // Add all elements of arr1 to the HashSet
        for (int i = 0; i < arr1.length; i++) {
            data.add(arr1[i]);
        }

        // Check if all elements of arr2 are present in the HashSet
        for (int j = 0; j < arr2.length; j++) {
            if (!data.contains(arr2[j])) {
                return false; // If any element of arr2 is not found, return false
            }
        }

        return true; // If all elements of arr2 are found in arr1, return true
    }

    // Main method to test the isSubset method
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 8};

        // Output: false, as arr2 is not a subset of arr1
        System.out.println(isSubset(arr1, arr2)); 

        int[] arr3 = {11, 1, 13, 21, 3, 7};
        int[] arr4 = {11, 3, 7, 1};

        // Output: true, as arr4 is a subset of arr3
        System.out.println(isSubset(arr3, arr4)); 
    }
}
