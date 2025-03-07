import java.util.Scanner;

public class BasicCalculator {
    // Function for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for Division (handles division by zero)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return "Not a Number" if division by zero
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu for user
        System.out.println("Basic Calculator:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.print("Choose an operation (1-4): ");
        int choice = sc.nextInt();

        // Taking input numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform operation based on user choice
        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation (1-4).");
                validChoice = false;
        }
    }
}
