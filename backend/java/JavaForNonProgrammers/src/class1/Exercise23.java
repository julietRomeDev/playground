package class1;

public class Exercise23 {

	//Create a variable named counter, initialize it in zero.
	//Then, increase it using +=
	
	public static void main(String[] args) {
		
		int counter = 0, value;

		for(value = 0;  value < 10; value++) {

			counter += 10;
		}


		System.out.println("Counter value: " + counter);
	}
}