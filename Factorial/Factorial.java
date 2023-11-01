import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
        try {
	    //prompt the take user input
            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                BigInteger result = calculateFactorial(n);
                System.out.println("Factorial of " + n + " is: " + result);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // This method calculates the factorial of a integer using BigInteger.
    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE; // Initialize result to 1

        // Calculate the factorial by multiplying from 2 to n
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // Multiply result by i
        }

        return result; // Return the factorial as a BigInteger
    }
}
