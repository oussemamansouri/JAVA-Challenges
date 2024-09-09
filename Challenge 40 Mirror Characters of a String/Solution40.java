public class Solution40 {
    
    /**
     * Mirrors characters from position N to the end of the string in alphabetical order.
     *
     * @param input the input string
     * @param index the position from where to start mirroring characters
     * @return the resulting string after mirroring
     */
    public static String mirrorCharacters(String input, int index) {
        // Convert the input string to lowercase
        input = input.toLowerCase();
        
        // Validate the input string
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty!");
        }
         
        // Validate the position index
        if (index < 1 || index > input.length()) {
            throw new IllegalArgumentException("Invalid position.");
        }

        // Alphabet string in reverse order for mirroring operation
        String alphat = "zyxwvutsrqponmlkjihgfedcba";
        // Convert to 0-based index
        index--;

        // StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Append characters up to the index position without changes
        for (int i = 0; i < index; i++) {
            result.append(input.charAt(i));
        }
        
        // Mirror characters from the index position to the end of the string
        for (int i = index; i < input.length(); i++) {
            result.append(alphat.charAt(input.charAt(i) - 'a'));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage and test case
        String input = "formation";
        int index = 4;
        String result = mirrorCharacters(input, index);
        System.out.println("Input: " + input + ", Index: " + index);
        System.out.println("Output: " + result);
    }
}
