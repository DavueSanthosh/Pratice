package Loop;

public class Dowhile {

	public static void main(String[] args) {
		int number = 10;
		int variable = 11;

		do {
			System.out.println("The number is:" + number);
			number++;
		}
		while (number <= 100);
		
	
		if (variable % 2 == 0) {
			
			System.out.println("the number is even");
		} 
		else {
			System.out.println("the number is odd");
		}

	}
}