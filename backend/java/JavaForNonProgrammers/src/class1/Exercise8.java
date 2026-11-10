public class Exercise8 {

	public static void main(String[] args) {
		
		System.out.println("A");
		String word_1 = "Hello";
		String word_2 = "World";
		String sentence;

		System.out.println("B");
		sentence = word_1 + word_2;
		System.out.println(sentence);

		System.out.println("C");
		sentence = word_1 + " " + word_2;
		System.out.println(sentence);

		System.out.println("D");
		sentence = word_1 + "\t" + word_2;
		System.out.println(sentence);

		System.out.println("E");
		sentence = word_1 + "\n" + word_2;
		System.out.println(sentence);

		System.out.println("F");
		sentence = word_1 + "\"" + word_2 + "\"";
		System.out.println(sentence);

		

	}
}