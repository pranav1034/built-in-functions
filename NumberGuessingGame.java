import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessedCorrectly) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'high', 'low', or 'correct': ");
            String feedback = sc.next().toLowerCase();

            if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("Yay! I guessed your number.");
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }
    }
}

