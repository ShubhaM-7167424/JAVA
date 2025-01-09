
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //     Calculator Program

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^) : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    validOperation = false;
                    System.out.println("Cannot Divide by zero! ");
                } else {
                    result = num1 / num2;
                }
            }

            case '^' ->
                result = Math.pow(num1, num2);
            default -> {
                validOperation = false;
                System.out.println("Invalid Operator! ");
            }
        }

        if (validOperation) {
            System.out.printf("%.2f", result);
        }

        scanner.close();
    }
}