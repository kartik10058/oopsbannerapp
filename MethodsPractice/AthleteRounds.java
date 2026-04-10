// Program to find number of rounds to complete 5km in a triangular park
import java.util.Scanner;

public class AthleteRounds {

    // Method to calculate number of rounds to complete 5km
    public static double calculateRounds(double side1, double side2, double side3) {
        // Perimeter of triangle
        double perimeter = side1 + side2 + side3;
        // Distance to cover in meters (5km = 5000m)
        double distanceInMeters = 5000;
        // Rounds = distance / perimeter
        double rounds = distanceInMeters / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for 3 sides of triangle
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Validate sides
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.err.println("Invalid sides.");
            System.exit(0);
        }

        // Calculate and display rounds
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds to complete 5km: " + Math.ceil(rounds));

        // Close scanner
        input.close();
    }
}