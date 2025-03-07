import java.util.Scanner;

public class FibonacciGenerator {
    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second; // Compute next term
            first = second;
            second = next;
        }
        System.out.println(); // Move to new line after sequence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Input validation
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(terms);
        }
    }
}
