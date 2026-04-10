// Program to convert text to uppercase using charAt() and verify with toUpperCase()
import java.util.Scanner;

public class ToUpperCase {

    // Method to convert string to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // ASCII: 'a'=97, 'A'=65, difference is 32
            if (ch >= 97 && ch <= 122) {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
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
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String userDefinedUpperCase = convertToUpperCase(text);

        // Convert using built-in toUpperCase()
        String builtInUpperCase = text.toUpperCase();

        // Compare and display
        System.out.println("User-defined uppercase: " + userDefinedUpperCase);
        System.out.println("Built-in toUpperCase(): " + builtInUpperCase);
        System.out.println("Both match: " + compareStrings(userDefinedUpperCase, builtInUpperCase));

        // Close scanner
        sc.close();
    }
}