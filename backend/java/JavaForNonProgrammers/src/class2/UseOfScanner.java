package class2;

import java.util.*;

public class UseOfScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String message;
		int number;
		double doubleNumber;
		char charValue;

		System.out.println("Enter an String:");
		message = scanner.next();

		System.out.println("Enter a number:");
		number = scanner.nextInt();

		System.out.println("Enter a Decimal Value: ");
		doubleNumber = scanner.nextDouble();

		System.out.println("Enter a char");
		charValue = scanner.next().charAt(0);

		System.out.println(message);
		System.out.println(number);
		System.out.println(doubleNumber);
		System.out.println(charValue);

	}

}