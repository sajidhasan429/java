public class UniqueCharacter {

    public static char findFirstUniqueCharacter(String str) {
        // Create an array to store the frequency of each character in the string
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Traverse the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
        }

        // Traverse the string again to find the first unique character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCount[ch] == 1) {
                return ch;
            }
        }

        // If no unique character is found, return a default character like '\0'
        return '\0';
    }

    public static void main(String[] args) {
        String inputString = "programming";

        char firstUnique = findFirstUniqueCharacter(inputString);

        if (firstUnique != '\0') {
            System.out.println("The first unique character in the string is: " + firstUnique);
        } else {
            System.out.println("No unique character found in the string.");
        }
    }
}
