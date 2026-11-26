package class2;

public class Exercise2 {

	//Inform the multiply of two positive numbers
	public static void main(String[] args) {
		int a = 10, b = -2, c = 5, result;
		boolean control;
		if (a > 0 && b > 0) {
			result = (a * b);
			System.out.println(result);
			control = false;
			System.out.println(control);

		}else if(a > 0 && c > 0) {
			result = (a * c);
			System.out.println(result);
			control = true;
			System.out.println(control);

		}else if(c > 0 && b > 0) {
			result = (c * b);
			System.out.println(result);
			control = true;
		}else{
			result = (b * c);
			System.out.println(result);
			control = true;
		}

	}
}