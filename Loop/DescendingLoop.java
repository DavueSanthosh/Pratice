package Loop;

public class DescendingLoop {

	
	public static void main(String[] args) {
		
      int numbers[] = { 2, 3, 6, 9, 7, 4 };
		int temporary = 0;
		
		System.out.println("Order of the array");
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);

		}

		
		for (int index = 0; index < numbers.length; index++) {
			for (int secondIndex = index + 1; secondIndex < numbers.length; secondIndex++) {
				
				if (numbers[index] < numbers[secondIndex]) {
					
					temporary = numbers[index];
					numbers[index] = numbers[secondIndex];
					numbers[secondIndex] = temporary;
				}
			}
		}
		System.out.println(" ");
		
		
		System.out.println("Descending order");
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);
		}
	}
}
