package Loop;

public class length {

	public static void main(String[] args) {
		
		String numbers = "123456789";
		int count = 0;
		
		for (int index = 0; index <= numbers.length(); index++) {
			count++;

		}
		System.out.println("The number of the digit is:" + count);
	}
}