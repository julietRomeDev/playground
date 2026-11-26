package class2;

import java.util.*;

public class Exercise4WithSteroids {
	
	// Create a menu with the switch structure
	/**
	 * Enter two number and give to user the following
	 * options:
	 * 1- Addition
	 * 2- Substraction
	 * 3- Product
	 * 4- Division
	 * Then, show the operation result.
	**/
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int firstNumber, secondNumber, operation, result = 0;
		boolean isNumber = true;
		System.out.println("Enter the first value:");
		
		firstNumber = scanner.nextInt();
		
		System.out.println("Thanks, now, enter the second value:");
		
		secondNumber = scanner.nextInt();

		//Options
		System.out.println("Enter an option: "
			+ "\n 1. Addition"
			+ "\n 2. Substraction"
			+ "\n 3. Multiply" 
			+ "\n 4. Division");
		operation = scanner.nextInt();

		switch(operation) {
		case 1:
			result = firstNumber + secondNumber;
			break;
		case 2:
			result = firstNumber - secondNumber;
			break;
		case 3:
			result = firstNumber * secondNumber;
			break;
		case 4:
			result = firstNumber / secondNumber;
			break;
		default:

			System.out.println("Illegal option");
			isNumber = false;
		}
		if(isNumber) {
		System.out.println("The result is: " + result);
		}
	}
}