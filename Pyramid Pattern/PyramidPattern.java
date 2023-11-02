import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        // Prompt to take the user input
        Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter the number print the rows : ");
	int rows = scanner.nextInt();

        // Print the pyramid pattern.
        for (int i = 1; i <= rows; i++) {//Loop to control the number of rows
            for (int j = 1; j <= i; j++) {// Loop to control the number of asterisks in each row
                System.out.print("*");
            }
            System.out.println();// Move to the next line to start a new row
        }
    }
}