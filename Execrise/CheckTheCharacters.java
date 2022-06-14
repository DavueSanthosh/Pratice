package Execrise;

public class CheckTheCharacters {

	String firstName;
	String secondName;
    int difference;
    
	public CheckTheCharacters(String firstName,String secondName) {
		this.firstName=firstName;
		this.secondName=secondName;
		
	}
	   
	

	public void characterDifference() {
		
		int difference=	firstName.length() - secondName.length();
			  
		
		if (firstName.length() < secondName.length()) {
			
			System.out.println(firstName + " is the largest");
			System.out.println(firstName + " is " + "  " + difference + "  "+"characters greater than " + firstName);
		}
		
		else if (firstName.length() == secondName.length()) {
			
			System.out.println("both are equal");
		
		} 
		
		else
			
		System.out.println(firstName + " is the largest");
		System.out.println(firstName + " is "+difference +" " + "characters greater than " + secondName);

	
	    System.out.println("Difference between the two characters is:"+" "+difference );
		
		
		
	}

}
