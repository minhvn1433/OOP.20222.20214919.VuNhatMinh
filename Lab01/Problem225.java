// Write a program to calculate sum, difference, product, and quotient of 2 double numbers which 
// are entered by users.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem225 {
    public static void main(String[] args) {
        // Prompt the user input
        Scanner myScanner = new Scanner(System.in);

        double num1 = 0.0;
        double num2 = 0.0;

        // Handling error
        try {
            System.out.print("Enter first number: ");
            num1 = myScanner.nextDouble();  

            System.out.print("Enter second number: ");
            num2 = myScanner.nextDouble();           
        }
        catch (InputMismatchException exception) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        if (num2 == 0) {
            System.out.println("Zero division error");
            System.exit(0);
        }

        myScanner.close();

        // Calculate result
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Output result
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}