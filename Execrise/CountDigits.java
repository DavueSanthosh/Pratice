package Execrise;



public class CountDigits {

	int number;
	int count;

	public CountDigits(int number) {

		this.number = number;
	}

	public void totalDigit() {
		
		while (number > 0) {
			number = number / 10;
			count++;

		}
           System.out.println("Total Digit of the number:"+" "+count);
	}
}
