package hust.soict.dsai.lab01;
// 6.6 Write a Java program to add two matrices of the same size.

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        // Select size of the matrices
        Scanner input = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rows = input.nextInt();
        System.out.print("Number of columns: ");
        int cols = input.nextInt();

        // Create two matrices
        double matrix1[][] = new double[rows][cols];
        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        double matrix2[][] = new double[rows][cols];
        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        // Calculate sum of two matrices
        double sum[][] = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("Sum of two matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}