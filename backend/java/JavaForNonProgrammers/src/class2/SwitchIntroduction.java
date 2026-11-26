package class2;

public class SwitchIntroduction {

	/*
		switch(number) {
		case1:
			value;
			break;
		case 2:
			value;
			break;
		default:
			value;
			break; 
		}
	*/
	public static void main(String[] args) {
		int example = 10;
		
	//	if (example == 10) {
	//		System.out.println("Ten");
			
	//	}else if(example == 20) {
	//		System.out.println("Twenty");

	//	}else if(example == 30) {
	//		System.out.println("Thirty");
	//	}

		switch(example) {
		case 10:
			System.out.println("TEN");
			break;
		case 20:
			System.out.println("TWENTY");
			break;
		case 30:
			System.out.println("THIRTY");
			break;
		default:
			System.out.println("ERROR: Value not found");


		}
	}
}