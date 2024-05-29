public class Solution {

    // Method to perform left rotation on an array
    public static int[] rotateArray(int[] array, int positions) {
        int[] rotatedArray = new int[array.length];
        int j = 0;

        // Copy elements from the specified position to the end of the array
        for (int i = positions; i < array.length; i++) {
            rotatedArray[j] = array[i];
            j++;
        }
        // Copy elements from the beginning of the array to the specified position
        for (int i = 0; i < positions; i++) {
            rotatedArray[j] = array[i];
            j++;
        }
        return rotatedArray; // Return the rotated array
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        
        try {
            // Perform rotation and update the array
            array = rotateArray(array, 2);
            
            // Print each element of the rotated array
            for (int i : array) {
                System.out.println(i);
            }
        } catch (Exception e) {
            // Print exception message if any
            System.out.println(e.getMessage());
        }
    }
}
