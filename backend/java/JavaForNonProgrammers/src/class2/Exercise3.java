package class2;

public class Exercise3 {

	public static void main(String[] args) {
		String user;
		//user = "josh";
		int password = 123;
		
		user = new String("josh");
		
		if (user.equals("josh") && password == 123) {
			System.out.println("Welcome " + user + "!");
		
		}else if(!user.equals("josh") && password == 123) {
			System.out.println("Incorrect User!");
		
		}else if(user.equals("josh") && password != 123)  {
			System.out.println("Incorrect Password!");

		}		

	}
}