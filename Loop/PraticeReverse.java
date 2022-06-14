package Loop;

public class PraticeReverse {

	public static void main(String[] args) {

		String words = "The name is san";
		String name = " ";

	  for (int index = words.length()-1;index >= 0 ; index--) {
		  
		  char splitTheWords = words.charAt(index);
	        name=name+splitTheWords;
	}
		if (words == name) {
			
			System.out.println("The number is palindrome");

		} 
		else {
			System.out.println("The number is not palindrome");
		}
	}

}
