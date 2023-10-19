import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        String original, reverse = ""; // Declare two String variables to store the original and reversed strings
        Scanner in = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.println("Enter a string : ");
        original = in.nextLine(); // Read the user's input and store it in the 'original' variable

        int length = original.length(); // Get the length of the input string/number

        for (int i = length - 1; i >= 0; i--) {
            // Loop to reverse the input string/number
            reverse = reverse + original.charAt(i); // Append characters from the end to the start to build the reversed string
        }

        if (original.equals(reverse)) {
            // Compare the original and reversed strings to check if they are the same
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println("Entered string isn't a palindrome.");
        }
    }
}
