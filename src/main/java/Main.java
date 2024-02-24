import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Assuming args[0] is the command and subsequent args are the numbers
        String command = args[0];
        int[] numbers = Arrays.stream(args).skip(1).mapToInt(Integer::parseInt).toArray();
        
        // Perform the corresponding operation based on the command
        switch (command) {
            case "add":
                System.out.println(calculator.add(numbers[0], numbers[1]));
                break;
            case "subtract":
                System.out.println(calculator.subtract(numbers[0], numbers[1]));
                break;
            case "multiply":
                System.out.println(calculator.multiply(numbers[0], numbers[1]));
                break;
            case "divide":
                System.out.println(calculator.divide(numbers[0], numbers[1]));
                break;
            case "fibonacci":
                System.out.println(calculator.fibonacciNumberFinder(numbers[0]));
                break;
            case "binary":
                System.out.println(calculator.intToBinaryNumber(numbers[0]));
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}
