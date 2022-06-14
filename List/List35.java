package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List35 {

	public static void main(String[] args) {
		List m1 = new ArrayList<>();
		System.out.println("Santhosh");
		m1.add("happy");
		m1.add("Hello");
		m1.add("smile");
		m1.add("freeze");
		System.out.println(m1);
		List m2 = new ArrayList<>();
		System.out.println("vidhya detalis");
		m2.add("ECE student");
		m1.addAll(m2);
		System.out.println(m2);
		
		for (int i = 0; i < m1.size(); i++) {
			 Object obj = m1.get(i);
			System.out.println( obj);
		}
		for (Object object : m2) {
			
		}

	}
}
