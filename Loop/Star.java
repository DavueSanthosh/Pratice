package Loop;

public class Star {

	public static void main(String[] args) {

		for (int index = 0; index < 5; index++) {

			for (int secondaryIndex = 0; secondaryIndex <= index; secondaryIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
