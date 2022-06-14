package Loop;

public class NameVowels 
{

	public static void main(String[] args) {
		
       String name="learn from the mistake";
          
      for (int index = 0; index < name.length(); index++) {
       char splitAndCheck=name.charAt(index);
        	  
   	  if (splitAndCheck=='a' || splitAndCheck=='e'||splitAndCheck=='i'||splitAndCheck=='o'||splitAndCheck=='u') {
        		  
				System.out.println("The Vowels is:"+ name.charAt(index));
				System.out.println("POSITION IS:"+index);
			}
			
		}
        		  
	}

}
