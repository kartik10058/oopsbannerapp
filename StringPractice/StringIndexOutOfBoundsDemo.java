// Program to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            // Access index beyond the length of the string
            System.out.println(text.charAt(text.length() + 5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Handle the exception
        System.out.println("Handling StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBoundsException(text);

        // Close scanner
        sc.close();
    }
}