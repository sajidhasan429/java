import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	//Take the user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
	
	//if the function check is prime or not than print the number is prime or not
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Check if the number is less than 2 (0 and 1 are not prime)
        if (num < 2) {
            return false;
        }
        
        // Check if the number is divisible by any integer from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If it's divisible, it's not prime
            }
        }
        
        // If the loop completes without finding a divisor, the number is prime
        return true;
    }
}
