package Training;

public class DescendingOrder {

	public static void main(String[] args) {
        int num[] = { 5, 6, 7, 9, 3 };
		int temp = 0;
		
		System.out.println("The order is:");
		for (int Index = 0; Index < num.length; Index++) {
			System.out.println(num[Index]);
		}
		
		for (int Index = 0; Index < num.length; Index++) {
			for (int split = Index + 1; split < num.length; split++) {
				
				if (num[Index] < num[split]) {
					temp = num[Index];
					num[Index] = num[split];
					num[split] = temp;
				}

			}
		}
		System.out.println("The descending order");
		for (int Index = 0; Index < num.length; Index++) {
			System.out.println(num[Index]);
		}

	}

}
