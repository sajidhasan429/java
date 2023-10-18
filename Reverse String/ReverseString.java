public class ReverseString {
    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, it is already reversed
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            // Recursive step: reverse the substring excluding the first character
            // and then append the first character at the end
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        // Input string
        String input = "Hello, World!";
        
        // Call the reverseString method and print the reversed string
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
