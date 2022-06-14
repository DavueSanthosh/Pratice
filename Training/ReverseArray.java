package Training;

public class ReverseArray {

	int number[] = { 3, 4, 5, 6 };

	public void reverse() {

		System.out.println("Original array");

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + " ");
		}

		System.out.println("reverse array");

		for (int j = number.length - 1; j >= 0; j--) {
			System.out.println(number[j] + " ");

		}
	}

	public static void main(String[] args) {
		ReverseArray array = new ReverseArray();
		array.reverse();
	}
}
