package class2;

public class CalculateIfPair {

	/*
	Informate if number is pair
	*/

	public static void main(String[] args) {
		int number = 6;
		boolean isPair;

		if(number %2 == 0) {
			isPair = true;
			System.out.println("Veredict: " + isPair);
		}else if(number %2 != 0) {
			isPair = false;
			System.out.println("Veredict: " + isPair);
		}

	}
}