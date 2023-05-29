package hust.soict.dsai.lab01;
// 2.2.6 Write a program to solve:
// - The first degree equation (linear equation) with one variable
// - The system of first-degree equations (linear system) with two variables
// - The second-degree equation with one variable

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquationSolver {
    // Main method
    public static void main(String[] args) {
        // Prompt the user input
        Scanner myScanner = new Scanner(System.in);

        int input = 0;

        // Select type of problem. Throw an exception if input is not valid
        try {
            System.out.println("1. The first degree equation (linear equation) with one variable");
            System.out.println("2. The system of first-degree equations (linear system) with two variables");
            System.out.println("3. The second-degree equation with one variable");
            System.out.print("Select type of equation to solve by typing the corresponding number (1 - 3): ");
            input = myScanner.nextInt();
        }
        catch (InputMismatchException exception) {
            System.out.println("Please choose a number between 1 or 3");
            System.exit(0);
        }

        switch (input) {
            case 1:
                linearEquationSolver(myScanner);
                break;
            case 2:
                linearSystemSolver(myScanner);
                break;
            case 3:
                quadraticEquationSolver(myScanner);
                break;
            default:
                System.out.println("Please choose a number between 1 or 3");
        }

        myScanner.close();
    }

    // Linear equation solver
    static void linearEquationSolver(Scanner myScanner) {
        double a = 0;
        double b = 0;

        // Throw an exception if input is not valid
        try {
            System.out.print("Enter the value of a: ");
            a = myScanner.nextDouble();
            System.out.print("Enter the value of b: ");
            b = myScanner.nextDouble();
        }
        catch (InputMismatchException exception) {
            System.out.println("The coefficient must be number");
            System.exit(0);
        }

        if (a == 0) {
            System.out.println("The first coefficient must be a nonzero");
            System.exit(0);
        }

        // Solve
        double x = -b / a;
        System.out.println("x: " + x);
    }
    
    // Linear system solver
    static void linearSystemSolver(Scanner myScanner) {
        double a11 = 0;
        double a12 = 0;
        double b1 = 0;
        double a21 = 0;
        double a22 = 0;
        double b2 = 0;

        // Throw an exception if input is not valid
        try {
            System.out.print("Enter value of a11: ");;
            a11 = myScanner.nextDouble();
            System.out.print("Enter the value of a12: ");
            a12 = myScanner.nextDouble();
            System.out.print("Enter value of b1: ");;
            b1 = myScanner.nextDouble();
            System.out.print("Enter the value of a21: ");
            a21 = myScanner.nextDouble();
            System.out.print("Enter value of a22: ");;
            a22 = myScanner.nextDouble();
            System.out.print("Enter the value of b2: ");
            b2 = myScanner.nextDouble();
        }
        catch (InputMismatchException exception) {
            System.out.println("The coefficient must be a number");
            System.exit(0);
        }

        // Solve
        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;
        if (d == 0) {
            if (d1 == 0 && d2 == 0) {
                System.out.println("The system has infinitely many solutions");
            }
            else {
                System.out.println("The system has no solution");
            }
        }
        else {
            double x = d1 / d;
            double y = d2 / d;
            System.out.println("The system has a unique solution");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
    
    // Quadratic equation solver
    static void quadraticEquationSolver(Scanner myScanner) {
        double a = 0;
        double b = 0;
        double c = 0;

        // Throw an exception if input is not valid
        try {
            System.out.print("Enter value of a: ");;
            a = myScanner.nextDouble();
            System.out.print("Enter the value of b: ");
            b = myScanner.nextDouble();
            System.out.print("Enter value of c: ");;
            c = myScanner.nextDouble();
        }
        catch (InputMismatchException exception) {
            System.out.println("The coefficient must be a number");
            System.exit(0);
        }

        if (a == 0) {
            System.out.println("The first coefficient must be a nonzero");
            System.exit(0);
        }

        // Solve
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The equation has no real solutions");
        }
        else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has a unique solution");
            System.out.println("x: " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two solutions");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    } 
}