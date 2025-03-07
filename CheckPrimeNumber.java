import java.util.Scanner;

public class CheckPrimeNumber {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // If divisible by any number, it's not prime
        }
        return true; // Otherwise, it's prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking if it's prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}
