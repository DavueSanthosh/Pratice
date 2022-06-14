package Loop;

public class Palindrome {

	public static void main(String[] args) {
		
        String words="Santhosh";
        String emptySpace="";
        
        for (int index = words.length()-1;index>=0; index--) {
        	emptySpace=emptySpace+words.charAt(index);
		
        }
        
        if (words.equals(emptySpace)) {
        	
			System.out.println("the number is palindrome");
		}
        
        else {
        	
			System.out.println("the number is not palindrome");

		}
	}

}
