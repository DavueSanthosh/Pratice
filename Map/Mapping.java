package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping {

	public static void main(String[] args) {
		HashMap<Integer, String> cartoon = new HashMap<Integer, String>();
		cartoon.put(5, "Star");
		cartoon.put(10, "Ben");
		cartoon.put(20, "cap");
		
		Collection<String> fg = cartoon.values();
		System.out.println(cartoon.values());
		System.out.println(cartoon.keySet());
		
		Set<Entry<Integer, String>> integer = cartoon.entrySet();
		System.out.println(integer);
		
		for (Entry<Integer, String> iteration : integer) {
			System.out.println("the value is" + iteration.getValue());
			System.out.println("the key is" + iteration.getKey());

		}

	}
}
