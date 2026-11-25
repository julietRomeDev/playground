package class1;

public class Exercise33 {

	// Create a system that allow login only when validUser and validPassword are true
	public static void main(String[] args) {

		boolean validUser, validPassword;
		validUser = true;
		validPassword = true;

		if (validUser && validPassword) {
			System.out.println("Welcome!");
			
		}else if(validUser != true && validPassword) {
			System.out.println("Invalid user! Please check it out");
		}else if(validUser && validPassword != true) {
			System.out.println("Invalid password! Please check it out");
		}else if(validUser != true && validPassword != true) {
			System.out.println("Invalid credentials!");
		}
		
	}
}