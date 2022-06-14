package Training;

public class Vowel {

	public static void main(String[] args) {
		String name = "Bring me thanos";
		
		for (int Index = 0; Index < name.length(); Index++) {
				char VowelsCheck = name.charAt(Index);
				
		if (VowelsCheck == 'a' || VowelsCheck == 'e' || VowelsCheck == 'i' || VowelsCheck == 'o' || VowelsCheck == 'u') {
				
			System.out.println("The vowels are:" + name.charAt(Index));
			System.out.println("The position are:" + Index);
			}

		}
	}
}
