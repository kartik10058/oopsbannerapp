// Program to check if text is palindrome using 3 different methods
import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from start and end using loop
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if start >= end, it's a palindrome
        if (start >= end) return true;
        // If characters at start and end don't match, not a palindrome
        if (text.charAt(start) != text.charAt(end)) return false;
        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character array comparison
    public static boolean isPalindromeCharArray(String text) {
        // Convert to char array
        char[] original = text.toCharArray();
        // Create reverse array using charAt()
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text to check palindrome: ");
        String text = sc.nextLine();

        // Check palindrome using all 3 methods
        System.out.println("Logic 1 (Loop): " + isPalindromeLoop(text));
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Char Array): " + isPalindromeCharArray(text));

        // Close scanner
        sc.close();
    }
}