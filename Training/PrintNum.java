package Training;

public class PrintNum {

	public static void main(String[] args) {
		
           String Words="The number is 987";
           for (char string : Words.toCharArray()) {
        	   
			if (Character.isDigit(string)) {
				
				System.out.println(string+" ");
			}
		}
	}

}
