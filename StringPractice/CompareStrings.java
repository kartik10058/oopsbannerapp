// Program to compare two strings using charAt() and verify with equals()
import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // Check lengths first
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using user-defined method
        boolean userDefinedResult = compareStrings(str1, str2);

        // Compare using built-in equals() method
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("User-defined comparison result: " + userDefinedResult);
        System.out.println("Built-in equals() result: " + builtInResult);
        System.out.println("Both results match: " + (userDefinedResult == builtInResult));

        // Close scanner
        sc.close();
    }
}
