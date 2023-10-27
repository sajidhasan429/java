import java.util.Scanner;
class BinaryToDecimal {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a binary number
        System.out.print("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();

	// Initialize variables for decimal conversion
     	int decimalNumber = 0;
      	int base = 1;
      	
	// Create a temporary variable to work with the binary number
	int temp = binaryNumber;
	
	// Convert binary to decimal using a while loop
      	while (temp > 0) {
         	int lastDigit = temp % 10;// Get the last digit of the binary number
         	temp = temp / 10;// Remove the last digit from the binary number
         	decimalNumber += lastDigit * base;// Add the contribution of the current digit to the result
         	base = base * 2;// Update the base to the next power of 2
      	}
	
	// Display the binary and decimal numbers
      	System.out.println("Binary number: " + binaryNumber);
      	System.out.println("Decimal number: " + decimalNumber);
   }
}