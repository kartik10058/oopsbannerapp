// Program to check if a number is positive, negative or zero using a method
import java.util.Scanner;

public class NumberSign {

    // Method to check sign: returns 1 for positive, -1 for negative, 0 for zero
    public static int checkSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method and display result
        int sign = checkSign(number);
        if (sign == 1) {
            System.out.println(number + " is Positive.");
        } else if (sign == -1) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println(number + " is Zero.");
        }

        // Close scanner
        input.close();
    }
}