package Loop;

public class Reverse 
{
	public static void main(String[] args) {
		
		String name = "I can do this all day";
		String reverse = "";
		
		for (int index = name.length() - 1; index >= 0; index--) {
			reverse = reverse + name.charAt(index);

		}
		System.out.println(reverse);
		
		if(name.equals(reverse)) {
			
			System.out.println("the palindrome");
			
		}
		else {
			System.out.println("number is not palindrome");
		}
			
	}

}