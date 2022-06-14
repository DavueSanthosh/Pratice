package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet iceCream = new HashSet();
		
		iceCream.add("The Size");
		iceCream.add("loop");
		iceCream.add("Butter skotch");
		iceCream.add("Vanila");
		iceCream.add("loop");
		iceCream.remove("loop");
		System.out.println(iceCream);
		
	//	Iterator rogers = EA.iterator();
	//	while (rogers.hasNext()) {
		//	System.out.println(rogers.next());
	//	}
		for (Object object : iceCream) {
			System.out.println(object);
		}
		// System.out.println(EA.hashCode());
	}
}
