// 6.3 Write a program to display a triangle with a height of n stars (*), n is entered by users.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int n = 1;
		
		// Throw an exception if input is not valid
		try {
			System.out.print("n: ");
			n = myScanner.nextInt();
		}
		catch (InputMismatchException exception) {
			System.out.println("Input must be a positive integer");
		}
		
		if (n < 1) {
			System.out.println("Input must be greater than zero");
		}
		
		// Display the triangle
		for (int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(n - i) + "*".repeat(i * 2 - 1));
		}
		
		myScanner.close();
	}
}
