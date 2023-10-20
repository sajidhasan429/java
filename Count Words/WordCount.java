import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence or paragraph
        System.out.print("Enter a sentence or paragraph: ");
        String input = scanner.nextLine();

        // Close the scanner as we no longer need it
        scanner.close();

        // Split the input into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Initialize a variable to keep track of the word count
        int wordCount = words.length;

        // Display the word count
        System.out.println("Word count: " + wordCount);
    }
}
