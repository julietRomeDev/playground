package class1;

public class Exercise43 {
	//// Check if a number is less than 0 or greater than 100 using ||
	public static void main(String[] args) {

		int number = 25;

		if(number < 0 || number > 100) {
			System.out.println("Is greater than one thousand");
		}else {
			System.out.println("Is less than zero");
		}
		
	}
}