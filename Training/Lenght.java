package Training;

public class Lenght {

	public static void main(String[] args) {
		String name = "I am Ironman";
		
		int count = 0;
		
		for (int Index = 0; Index <= name.length(); Index++) {
			count++;
		
		}
		
		System.out.println("The Word is:"+ " "  + name);
		System.out.println("The Total lenght of the word:"  +" " + count);
	}

}
