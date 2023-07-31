package org.example;

import java.util.Scanner;

public class Calculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        int result;
        String operation;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                operation = "Addition";
                break;
            case 2:
                result = subtract(num1, num2);
                operation = "Subtraction";
                break;
            case 3:
                result = multiply(num1, num2);
                operation = "Multiplication";
                break;
            case 4:
                double quotient = divide(num1, num2);
                System.out.println("Quotient: " + quotient);
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.println(operation + " result: " + result);

        scanner.close();
    }
}
