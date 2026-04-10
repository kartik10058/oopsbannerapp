// Program to find maximum number of handshakes using a method
import java.util.Scanner;

public class Handshakes {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        // combination = n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.err.println("Invalid number of students.");
            System.exit(0);
        }

        // Calculate and display handshakes
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of handshakes: " + handshakes);

        // Close scanner
        input.close();
    }
}