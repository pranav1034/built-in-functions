import java.util.Scanner;

public class TemperatureConverter {
    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User chooses conversion type
        System.out.println("Temperature Converter:");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        // Perform conversion based on choice
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(f));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(c));
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
    }
}
