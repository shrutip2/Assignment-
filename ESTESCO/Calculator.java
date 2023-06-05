import java.util.Scanner;

public class Calculator {

    public static String add(String number) {
        // Parse the input string into a list of numbers.
        Scanner scanner = new Scanner(number);
        String delimiter = scanner.nextLine();
        List<Double> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(Double.parseDouble(scanner.next()));
        }

        // Check for errors.
        for (Double number : numbers) {
            if (number < 0) {
                return "Negative not allowed : " + number;
            }
        }

        // Calculate the sum of the numbers.
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }

        // Return the sum.
        return String.valueOf(sum);
    }

    public static String multiply(String number) {
        // Parse the input string into a list of numbers.
        Scanner scanner = new Scanner(number);
        String delimiter = scanner.nextLine();
        List<Double> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(Double.parseDouble(scanner.next()));
        }

        // Check for errors.
        for (Double number : numbers) {
            if (number < 0) {
                return "Negative not allowed : " + number;
            }
        }

        // Calculate the product of the numbers.
        double product = 1;
        for (Double number : numbers) {
            product *= number;
        }

        // Return the product.
        return String.valueOf(product);
    }

    public static void main(String[] args) {
        System.out.println("Enter a mathematical expression:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        // Split the expression into its components.
        String[] tokens = expression.split("\\s+");

        // Check if the expression is valid.
        if (tokens.length < 2) {
            System.out.println("Invalid expression.");
            return;
        }

        // Determine the operation to perform.
        String operation = tokens[0];

        // Call the appropriate function to perform the operation.
        String result = operation.equals("add") ? add(expression) : multiply(expression);

        // Print the result.
        System.out.println(result);
    }
}
