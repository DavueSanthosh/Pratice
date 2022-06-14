package Loop;

public class Counting {

	public static void main(String[] args) {
	    int number=987654;
	    
	    int sum,add = 0;
	    
	    while (number>0) {
	    	
			sum=number%10;
			add=add+sum;
			number=number/10;
			
			System.out.println(number);
		}
	    
	    System.out.println("The sum of all digits="+add);
	}

}
