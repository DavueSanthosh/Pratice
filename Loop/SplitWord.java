package Loop;

public class SplitWord {

	public static void main(String[] args) {
		
		String word = "I am ironman";
		String original = " ";

		for (int index = word.length() - 1; index >= 0; index--) {
			
			char reverse = word.charAt(index);
			original = original + reverse;
		}

		System.out.println("Original:" + word);
		System.out.println("Reverse:" + original);
	}
}
