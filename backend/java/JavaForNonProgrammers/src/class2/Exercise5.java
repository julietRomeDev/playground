package class2;

public class Exercise5 {

	/*
	Adjust the salary if category
	if category = A +50%
	if category = B +35%
	if category = C +25%
	the rest = +15%
	*/
	public static void main(String[] args) {
		
		char category = 'A';
		double salary = 65000;

		switch(category) {
		case 'A':
			salary = salary *= 1.50;
			break;
		case 'B':
			salary = salary *= 1.35;
			break;
		case 'C':
			salary = salary *= 1.25;
			break;
		default:
			salary = salary *= 1.5;
		}	
		System.out.println("Your salary is: " + salary);
	}

}