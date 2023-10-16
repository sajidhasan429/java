import java.util.Scanner;

public class StudentSelection {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their GPA
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Prompt the user for relevant coursework
        System.out.print("Do you have relevant coursework? (yes/no): ");
        String coursework = scanner.next();

        // Prompt the user for extracurricular activities
        System.out.print("Do you have extracurricular activities? (yes/no): ");
        String extracurricular = scanner.next();

        // Close the scanner
        scanner.close();

        // Check if the student is eligible
        if (gpa >= 3.0 && coursework.equalsIgnoreCase("yes") && extracurricular.equalsIgnoreCase("yes")) {
            System.out.println("Selected");
        } else {
            System.out.println("Not Selected");
        }
    }
}
