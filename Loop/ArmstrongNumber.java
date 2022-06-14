package Loop;

public class ArmstrongNumber
{
	int number;
	int armstrong;
	int splitTheNumber;
	int equal = number;

	public ArmstrongNumber(int armstrong, int number, int splitTheNumber) {

		this.armstrong = armstrong;
		this.number = number;
		this.splitTheNumber = splitTheNumber;

	}

	public void checkTheNumber() {

		while (number > 0) {

			splitTheNumber = number % 10;
			armstrong = armstrong + (splitTheNumber * splitTheNumber * splitTheNumber);
			number = number / 10;

		}
		if (armstrong == equal) {
			System.out.println("the number is Armstrong");

		}

		else {
			System.out.println("the number is not armstrong");
		}
	}

	public static void main(String[] args) {
		
		ArmstrongNumber check=new ArmstrongNumber(0,234,0);
		check.checkTheNumber();

	}
}
