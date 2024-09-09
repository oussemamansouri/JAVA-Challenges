public class Solution34 {

    // Method to insert stars at specified positions in a string
    public static String addStars(String text, int[] indexArray) {
        
        // Use StringBuilder for easier manipulation of the string
        StringBuilder newText = new StringBuilder(text);

        // Loop through each index in the array
        for (int i = 0; i < indexArray.length; i++) {
            // Check if the index is within the valid range
            if (indexArray[i] >= 0 && indexArray[i] <= newText.length()) {
                // Insert a star at the specified index plus the offset caused by previous insertions
                newText.insert(indexArray[i] + i, '*');
            }
        }

        // Return the resulting string
        return newText.toString();
    }

    public static void main(String[] args) {
        // Example usage of the addStars method
        int[] indexArray = {1, 5, 9};
        System.out.println(addStars("formation", indexArray));
    }
}
