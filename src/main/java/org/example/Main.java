package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2, result;
        String operator, continueCalculation = "";

        // Initializing result as 0
        result = 0;

        do {
            // Display current result and allow user to decide if they want to clear it
            if (num1 == 0) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                result = num1;  // Initialize result with num1
            } else {
                System.out.println("Current result: " + result);  // Show the current result
                num1 = result;  // Use the result as num1 for the next calculation
            }

            // Ask for the operator or "AC" to clear
            System.out.print("Enter the operator (+, -, *, /) or 'AC' to clear: ");
            operator = scanner.next();

            // If the user types 'AC', reset the result and skip the current operation
            if (operator.equalsIgnoreCase("AC")) {
                result = 0;
                num1 = 0;  // Reset num1 to 0
                System.out.println("All clear! The result has been reset.");
                continue;  // Skip the rest of the code and restart the loop
            }

            // Ask for the second number (only if the operator is valid)
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            // Perform calculation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /.");
            }

            // Ask if the user wants to perform another operation
            System.out.print("Do you want to perform another operation? (yes/no): ");
            continueCalculation = scanner.next();

        } while (continueCalculation.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}

