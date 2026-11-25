package class1;

public class Configuration {

	//Five constants static final for the app:
	/**
		1-Version
		2-Database
		3-User
		4-isAuth
		5-isLoggedIn
	**/

	public static final double VERSION = 1.5;
	public static final String DATABASE = "MyApp";
	public static final String USER = "admin";
	public static final boolean IS_LOGGED_IN = true;
	public static final boolean IS_AUTH = true;

	public static void main(String[] args) {
		
		System.out.println(VERSION);
		System.out.println(DATABASE);
		System.out.println(USER);
		System.out.println(IS_LOGGED_IN);
		System.out.println(IS_AUTH);
		
		
		
	}
}