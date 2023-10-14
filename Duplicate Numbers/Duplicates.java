// Nodoliya Sajidhasan Shabbirali
// URN :- 2022-M-18042000
// MCA Second Year

public class Duplicates {
    public static void main(String[] args) {
	// Initialize the array
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 5}; 

        System.out.println("Duplicate numbers in the array:");

	// Logic for the print duplicate numbers
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
		// Comparing the two numbers in each other
                if (arr[i] == arr[j] && i != j) {

		    //Print the duplicates numbers
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
