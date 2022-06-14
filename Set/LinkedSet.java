package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedSet {

	public static void main(String[] args) {
		
		 
    // LinkedHashSet set=new LinkedHashSet();
     // HashSet<String> set=new HashSet<String>();
		TreeSet<String> set=new TreeSet<String>();
		
		
		
     set.add("VTV");
     set.add("Oh my kaduvale");
     set.add("Minnale");
     set.add("Jeans");

    
     System.out.println(set.size());
     System.out.println(set.clone());
     System.out.println(set.equals(set));
     
     TreeSet<String> descending=(TreeSet<String>) set.descendingSet();
     System.out.println(descending);
     
	for (Object object : set) {
		System.out.println(object);
	}
		
	}
	
	}
	


