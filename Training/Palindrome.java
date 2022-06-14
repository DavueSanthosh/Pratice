package Training;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "Santhosh";
		String TotalStorage = " ";
		
		
		for (int index = name.length() - 1; index >= 0; index--) {
			TotalStorage = TotalStorage + name.charAt(index);
		
		}
		
		if (name==TotalStorage) {
			System.out.println("the sentence is palindrome");
		}
		else {
			System.out.println("the sentence is not palindrome");
		}
	}
}
