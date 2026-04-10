// Program to find string length without using length() method
import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find string length without using length()
    // Uses infinite loop with charAt() until exception is thrown
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception signals end of string
        }
        return count;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length using user-defined method
        int userDefinedLength = findLength(text);

        // Find length using built-in length()
        int builtInLength = text.length();

        // Display and compare results
        System.out.println("User-defined length: " + userDefinedLength);
        System.out.println("Built-in length(): " + builtInLength);
        System.out.println("Both match: " + (userDefinedLength == builtInLength));

        // Close scanner
        sc.close();
    }
}