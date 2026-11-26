package class2;

public class HowToIf {

	public static void main(String[] args) {
		
		/**
			
			if(condition) {
				sentences;
			}else{
				sentences;
			}
		**/

		int number = 10;
	/*	if (number < 15) {
			number++;			
		}else {
			number--;
		}
		*/
		
		if (number < 15) {
			number++;
			
		}else if(n > 15){
			number--;
		}else{
			number = number + 5;
		}

		System.out.println(number);

	}
}