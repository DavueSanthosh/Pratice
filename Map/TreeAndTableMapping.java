package Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TreeAndTableMapping {

	public static void main(String[] args) {
     // Map<Integer,String>food=new TreeMap<Integer,String>();
		
      Map<Integer,String>food=new Hashtable<Integer,String>();
      
      food.put(7, "San");
      food.put(6, "Santhosh");
      food.put(9, "Edge");
      food.put(10, "vk");
      
      System.out.println(food);
	}

}
