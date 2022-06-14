package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmptyList {

	public static void main(String[] args) {
		
		 List numbers = new ArrayList();
		 
		 numbers.add(1);
		 numbers.add(2);
		 numbers.add(3);
		 numbers.set(1, 11);
//		 
//	       Iterator orderthelist = numbers.iterator();
//	       System.out.println(numbers);
	       
	    boolean check = numbers.isEmpty();
	    
	    if(check== true)
	    	System.out.println("the list is empty");
	    
	    else
	    	System.out.println("the list is not empty");
	      // System.out.println(numbers);
	}

}
