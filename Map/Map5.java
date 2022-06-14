package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map5 {

	public static void main(String[] args) {
		
           Map<Integer,String>model=new HashMap<Integer,String>();
           model.put(10, "Java");
           model.put(20, "c++");
           model.put(30, "ruby");
           
    //       m.put(20, "milk");
       int size = model.size(); //   int size = m.size();
       
           System.out.println(size);
           
           Collection<String> values2 = model.values();
           System.out.println(values2);
           
           Set<Integer> keySet2 = model.keySet();
           System.out.println(keySet2);
           
           boolean ee = model.containsValue("ddd");
           System.out.println(ee);
           
           Set<Entry<Integer, String>> Set = model.entrySet();
           System.out.println(Set);
           
           //foreach ctrl+space
          for (Entry<Integer, String> model2 : Set) {
        	  
			System.out.println("key is"+model2.getKey());
			System.out.println("value is"+model2.getValue());
			//System.out.println(m);
		}
          System.out.println(model);
	}

}
