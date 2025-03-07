import java.util.Scanner;

public class GcdLcmCalculator {
    // Function to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        if (b == 0) return a; // Base case
        return gcd(b, a % b); // Recursive call
    }

    // Function to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // LCM formula: (a * b) / GCD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculating GCD and LCM
        int gcdValue = gcd(num1, num2);
        int lcmValue = lcm(num1, num2);

        // Displaying results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdValue);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmValue);
    }
}
