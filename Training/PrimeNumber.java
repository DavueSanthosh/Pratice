package Training;


 public class PrimeNumber 
 {
   	public static void main(String[] args) {
		
		for (int Index = 1; Index <= 50; Index++) {
			int count = 0;
			
			for (int SecondIndex = 2; SecondIndex <= Index/2; SecondIndex++) {
				if (Index%SecondIndex == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(Index);
			}

		}

	}
}