// 2.2.5 Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Prompt the user input
        Scanner myScanner = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        // Throw an exception if input is not valid
        try {
            System.out.print("Enter first number: ");
            num1 = myScanner.nextDouble();  
            System.out.print("Enter second number: ");
            num2 = myScanner.nextDouble();           
        }
        catch (InputMismatchException exception) {
            System.out.println("Input must be a double");
            System.exit(0);
        }

        if (num2 == 0) {
            System.out.println("The divisor must be a nonzero");
            System.exit(0);
        }

        // Calculate result
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Print result
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        myScanner.close();
    }
}