import java.util.Scanner;

public class FactorialUsingRecursion {
    
// Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case
        return n * factorial(n - 1);   // Recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Input validation
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calling the recursive function
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }
}
