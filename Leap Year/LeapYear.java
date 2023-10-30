import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        

        // Check if the year is a leap year
        boolean isLeapYear = false;

        // A year is a leap year if it is divisible by 4
        if (year % 4 == 0) {
            // If it's divisible by 100, it should also be divisible by 400
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        // Check and print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
