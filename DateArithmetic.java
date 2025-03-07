import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define a date formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Taking date input from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        // Parse the input string into a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);
        // Perform date arithmetic
        LocalDate newDate = date.plusDays(7)  // Add 7 days
                               .plusMonths(1) // Add 1 month
                               .plusYears(2)  // Add 2 years
                               .minusWeeks(3); // Subtract 3 weeks

        // Display the final result
        System.out.println("Modified Date: " + newDate.format(formatter));
    }
}
