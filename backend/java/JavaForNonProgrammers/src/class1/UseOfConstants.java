package class1;

public class UseOfConstants {

	public static void main(String[] args) {
		
		final double IVA = 21;

		double shirt = 59.90;
		double pants = 99.90;
		double jacket = 149.90;

		shirt += shirt * IVA / 100;
		pants += pants * IVA / 100;
		jacket += jacket * IVA / 100;

		System.out.println("Final price of SHIRT: " + String.format("%.2f", shirt));
		System.out.println("Final price of PANTS: " + String.format("%.2f", pants));
		System.out.println("Final price of JACKET: " + String.format("%.2f", jacket));

	}
}