package Loop;

public class PrimeNumber {

	public static void main(String[] args) {
			
		for (int index = 0; index <= 50; index++) {
			
			int count = 0;
		
			for (int secondIndex = 2; secondIndex < index / 2; secondIndex++) {
				if (index % secondIndex == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(index);
			}

		}
	}

}
