package hust.soict.dsai.lab01;
// 6.4 Write a program to display the number of days of a month, which is entered by users 
// (both month and year). If it is an invalid month/year, ask the user to enter again.

import java.util.Scanner;

public class DaysOfAMonth {
	public static void main(String[] args) {
		// Create scanner object. Initialize variables
		Scanner input = new Scanner(System.in);
		
		String monthStr;
		String yearStr;
		int year;
		int days;
		
		// Loop until user give valid input
		while (true) {
			// Prompt user input
			System.out.print("Enter a month and a year: ");
			monthStr = input.next();
			yearStr = input.next();

			// Go back to beginning of the loop if user give invalid year
			try {
				year = Integer.parseInt(yearStr);
				if (year < 0) {
					continue;
				}
			}
			catch (NumberFormatException exception) {
				continue;
			}

			// Go back to beginning of the loop if user give invalid month
			// Return number of days in month 
			switch (monthStr.toLowerCase()) {
				case "january":
				case "jan.":
				case "jan":
				case "1":
					days = 31;
					break;

				case "february":
				case "feb.":
				case "feb":
				case "2":
					if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
						days = 29;
					}
					else {
						days = 28;
					}
					break;

				case "march":
				case "mar.":
				case "mar":
				case "3":
					days = 31;
					break;

				case "april":
				case "apr.":
				case "apr":
				case "4":
					days = 30;
					break;

				case "may":
				case "5":
					days = 31;
					break;

				case "june":
				case "jun":
				case "6":
					days = 30;
					break;

				case "july":
				case "jul":
				case "7":
					days = 31;
					break;

				case "august":
				case "aug.":
				case "aug":
				case "8":
					days = 31;
					break;

				case "september":
				case "sept.":
				case "sep":
				case "9":
					days = 30;
					break;

				case "october":
				case "oct.":
				case "oct":
				case "10":
					days = 31;
					break;
				case "november":
				case "nov.":
				case "nov":
				case "11":
					days = 30;
					break;

				case "december":
				case "dec.":
				case "dec":
				case "12":
					days = 31;
					break;

				default:
					continue;
			}
			break;
		}

		// Print the number of days in month
		System.out.println("Number of days: " + days);
		input.close();
	}
}