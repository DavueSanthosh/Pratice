package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListTypes {

	public static void main(String[] args) {
		
		
     // Vector<Integer> vector=new Vector<Integer>();
      //LinkedList<Integer> vector=new LinkedList<Integer>();
      
      ArrayList<Integer> vector=new ArrayList<Integer>();
      
      vector.add(22);
      vector.add(32);
      vector.add(42);
      vector.add(52);
      System.out.println(vector);
      
      for (int index = 0; index < vector.size(); index++) {
    	  Integer integer = vector.get(index);
    	  System.out.println(integer);
	}
      
		for (Integer integer : vector) {
			System.out.println(integer);
		}
		
	}

}
