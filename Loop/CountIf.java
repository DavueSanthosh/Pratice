package Loop;

public class CountIf {

	public static void main(String[] args) {
		
		String Words = "Chdjidoklk 1233 jnfej";
		
		int Uppercase = 0;
		int Lowercase = 0;
		int number = 0;
		int special = 0;
		
		for (int index = 0; index < Words.length(); index++) {
			char splitAndCheck = Words.charAt(index);
			
			if (splitAndCheck >= 'A' && splitAndCheck <= 'Z')
				Uppercase++;
			
			else if (splitAndCheck >= 'a' && splitAndCheck <= 'z')
				Lowercase++;
			
			else if (splitAndCheck >= '0' && splitAndCheck <= '9')
				number++;
			
			else
				special++;

		}
		System.out.println("Uppercase:" + Uppercase);
		System.out.println("Lowercase:" + Lowercase);
		System.out.println("number:" + number);
	}

}
