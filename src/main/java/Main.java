import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command (add/subtract/multiply/divide/fibonacci/binary): ");
            String command = scanner.next();

            // Check for exit condition
            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter numbers separated by space: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // Perform the corresponding operation based on the command
            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case "divide":
                    System.out.println("Result: " + calculator.divide(num1, num2));
                    break;
                case "fibonacci":
                    System.out.println("Result: " + calculator.fibonacciNumberFinder(num1));
                    break;
                case "binary":
                    System.out.println("Result: " + calculator.intToBinaryNumber(num1));
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
        scanner.close();
    }
}
