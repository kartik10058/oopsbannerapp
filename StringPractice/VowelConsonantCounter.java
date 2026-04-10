// Program to count vowels and consonants in a string
import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if character is vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase using ASCII values
        if (ch >= 65 && ch <= 90) {
            ch = (char)(ch + 32);
        }
        // Check if it's a letter
        if (ch >= 97 && ch <= 122) {
            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Vowel count: " + counts[0]);
        System.out.println("Consonant count: " + counts[1]);

        // Close scanner
        sc.close();
    }
}