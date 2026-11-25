package class1;

public class Exercise31 {

	//Create two variables:
	// -registeredUser
	// -activeSession
	//Check if both are true

	public static void main(String[] args) {
		
		boolean registeredUser, activeSession;

		registeredUser = true;
		activeSession  = true;

		if (registeredUser && activeSession) {
			System.out.println("Both are TRUE");
		}else if (registeredUser || activeSession) {
			System.out.println("At least one is TRUE");
		}else{
			System.out.println("Both are FALSE");
		}
	}
}