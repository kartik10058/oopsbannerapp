// Program to calculate Simple Interest using a method
import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Simple Interest = Principal * Rate * Time / 100
        double simpleInterest = principal * rate * time / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for principal, rate, time
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("The Simple Interest is " + simpleInterest
            + " for Principal " + principal
            + ", Rate of Interest " + rate
            + " and Time " + time);

        // Close scanner
        input.close();
    }
}