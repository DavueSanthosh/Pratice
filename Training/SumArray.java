package Training;

public class SumArray {

	int number[] = { 2, 3, 4, 5 };
	int sum = 0;

	public void addition() {
		for (int i = 0; i < number.length; i++) {
			sum = number[i] * number[i];
		}
		System.out.println("The total of the array:" + sum);
	}

	public static void main(String[] args) {
		SumArray add = new SumArray();
		add.addition();
	}
}
