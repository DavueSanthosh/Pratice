package Loop;

public class VowelsIdentification {

	public static void main(String[] args) {
		String Name = "captain america";
		int count=0;
		
		for (int index = 0; index < Name.length(); index++) {
			char splitAndCheck = Name.charAt(index);
			
			if (splitAndCheck == 'a' || splitAndCheck == 'e' || splitAndCheck == 'i' || splitAndCheck == 'o' || splitAndCheck == 'u') {
		
				System.out.println("The vowels are:" + Name.charAt(index));
				count++;
			}
        System.out.println("the counetr is"+count);
		}
	}

}
