// Program to create substring using charAt() and verify with built-in substring()
import java.util.Scanner;

public class SubstringCreator {

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Validate indexes
        if (start < 0 || end > text.length() || start > end) {
            System.err.println("Invalid indexes.");
            System.exit(0);
        }

        // Create substring using user-defined method
        String userDefinedSubstring = createSubstring(text, start, end);

        // Create substring using built-in substring()
        String builtInSubstring = text.substring(start, end);

        // Compare and display results
        System.out.println("User-defined substring: " + userDefinedSubstring);
        System.out.println("Built-in substring(): " + builtInSubstring);
        System.out.println("Both match: " + compareStrings(userDefinedSubstring, builtInSubstring));

        // Close scanner
        sc.close();
    }
}
