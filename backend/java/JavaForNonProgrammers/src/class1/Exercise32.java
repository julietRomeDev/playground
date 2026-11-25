package class1;

public class Exercise32 {

	// Create a variable number and determinate if its between 10 and 50 inclusive.

	public static void main(String[] args) {
		
		int number;
		number = 15;

		if (number >= 10 && number <= 50) {
			System.out.println("The given number it's between 10 and 50.");
			
		}else {
			System.out.println("The number is out of range.");
		}
	}
}