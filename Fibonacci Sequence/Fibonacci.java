import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
	
	//Tack the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = scanner.nextInt();
	
	// You should enter the postivie numbers like 1,2,3..
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the first two Fibonacci numbers
            long first = 0;
            long second = 1;

            // Display the first n Fibonacci numbers
            System.out.print("Fibonacci Sequence up to the " + n + "-th numbers: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next Fibonacci number by adding the previous two
                long next = first + second;

                // MOdify the first and second for the next iteration
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
