package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTypes {

	public static void main(String[] args) {
		
		
		//HashMap<String,Integer> map=new HashMap<String,Integer>();
	
		//LinkedHashMap<String, Integer> map=new LinkedHashMap<String,Integer>();
		
		TreeMap<String,Integer>map=new TreeMap<String,Integer>();
		
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Enter the Size of the Key and Values");
		int size = Scan.nextInt();
		

		for (int index = 0; index < size; index++) {
			
			map.put(Scan.next(), Scan.nextInt());
			
		}
		
		
		
		
		
		System.out.println(map);
		
//		Integer integer = map.get("Choc");
//		System.out.println(integer);
//		
//		Integer integer2 = map.get("Lava");
//		System.out.println(integer2);
//		
//		Set<Entry<String,Integer>> entrySet2 = map.entrySet();
//		System.out.println(entrySet2);
//		
//		boolean replace = map.replace("Choc", 1, 6);
//		System.err.println(replace);
//		
//		Collection<Integer> values2 = map.values();
//		System.out.println(values2);
//		
//		Set<String> keySet = map.keySet();
//		System.out.println(keySet);
//		
//		Collection<Integer> values = map.values();
//		System.out.println(values);
//		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
//		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		} 
	}

}
