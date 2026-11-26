package class2;

public class Exercise1 {
	//Inform wich number is the major

	public static void main(String[] args) {
		
		int number1, number2, number3;
		number1 = 100;
		number2 = 500;
		number3 = 250;

		if (number1 > number2 && number1 > number3) {
			System.out.println("The higher is number1: " + number1);
			
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("The higher is number2:  " + number2);

		}else if(number3 > number1 && number3 > number2) {
			System.out.println("The higher is number3: " + number3);
		}
	}
}