package hust.soict.dsai.lab01;
// 6.5 Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.

import java.util.Arrays;
import java.util.Scanner;

public class SortNumericArray {
	public static void main(String[] args) {
		// Prompt user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		
		// Selection sort. temp: temporary variable. min: index of the minimum element in array
		int temp;
		int min;
		for (int i = 0; i < size; i++) {
			min = i;
			for (int j = i; j < size; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			}
		}
		
		// Calculate sum and average
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		double average = (double) sum / size;

		// Print the results
		System.out.println("Sorted array: " + Arrays.toString(array));
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		input.close();
	}
}