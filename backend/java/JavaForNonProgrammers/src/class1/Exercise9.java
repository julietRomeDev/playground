package class1;

public class Exercise9 {

	public static void main(String[] args) {
		
		System.out.println("A");
		boolean number1 = true, number2 = false, result, result2;
		result = !number1;
		result2 = !number2;
		System.out.println(number1);
		System.out.println(number2);

		System.out.println("B");
		result = number1 && number2;
		result2 = number1 || number2;
		System.out.println(result);
		System.out.println(result2);

		System.out.println("C");
		result = !(number1 && number2);
		result2 = !(number1 || number2);
		System.out.println(result);
		System.out.println(result2);

		System.out.println("D");
		result = !number1 && number2;
		result2 = !number1 || number2;
		System.out.println(result);
		System.out.println(result2);

	}
}