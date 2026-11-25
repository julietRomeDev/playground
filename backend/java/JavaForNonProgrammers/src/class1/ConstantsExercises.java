package class1;

class ConstantsExercises{

	//Declare a PI constant with the Value: 3.14159
	//Declare a MINIMUM_AGE constant with the Value: 18
	//Declare a APP_NAME constant of String type
	//Declare a IVA_VALUE constant with 21.0 value
	//Declare a LIGTH_VELOCITY constant with 29979248 value
	//Declare a MAXIMUM_SALARY constant and calculate the salary equivalent twice as its value
	//Declare a DISCOUNT constant and use it to calculate the final price
	//Declare two constant: WIDHT and HEIGHT and use it to calculate a display surface

	public static void main(String[] args) {

		final double PI = 3.14159;
		final int MINIMUM_AGE = 18;
		final String APP_NAME = "MATRIX";
		final double IVA = 21.0;
		final double LIGHT_VELOCITY = 29979248;
		final double MAXIMUM_SALARY = 60;
		final int DISCOUNT = 50;
		int price = 100;

		//Calculate de area of a circle
		double radius = 5;
		double area = PI * radius * radius;

		//Calculate the salary
		double doubleOfThatSalary = MAXIMUM_SALARY  * 4;

		//Display Surface
		final int WIDHT = 1920;
		final int HEIGHT = 1080;
		int surface = WIDHT * HEIGHT;


		//Discount
		price = price - DISCOUNT;


		
	}
}