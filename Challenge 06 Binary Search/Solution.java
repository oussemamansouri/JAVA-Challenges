public class Solution {
    
    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // Loop until the left pointer is less than or equal to the right pointer
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // If the middle element is the target, return its index
            if (array[mid] == target)
                return mid;

            // If the middle element is less than the target, search the right half
            if (array[mid] < target)
                left = mid + 1;
            // If the middle element is greater than the target, search the left half
            else
                right = mid - 1;
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] tab = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // Example usage of binarySearch method
        System.out.println(binarySearch(tab,23));
      
    }
}
