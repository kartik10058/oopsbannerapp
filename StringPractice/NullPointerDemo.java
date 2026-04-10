// Program to demonstrate NullPointerException
public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        // Initialize text to null
        String text = null;
        // Calling String method on null will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        // Initialize text to null
        String text = null;
        try {
            // This will throw NullPointerException
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // First call method to handle the exception
        System.out.println("Handling NullPointerException:");
        handleNullPointerException();

        // Uncommenting the line below would crash the program
        // generateNullPointerException();
    }
}
