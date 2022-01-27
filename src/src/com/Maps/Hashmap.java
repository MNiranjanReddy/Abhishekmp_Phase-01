package com.Maps;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap hs = new HashMap();
			
			hs.put(1,"Apple");
			hs.put(2,"orange");
			hs.put(3,"banana");
			hs.put(4,"Pineapple");
			hs.put(5,"Papaya");
			hs.put(6,"Mango ");
			hs.put(7,"Guava");
			hs.put(8,"Lemon");
			hs.put(9,"Watermelon");
			hs.put(10,"Blackberry ");
			
			  
			System.out.println("hashmap is "+ hs);
			System.out.println( "remove 4 and 7 "+hs.remove("4") +hs.remove("7"));
			System.out.println("After removal process, the hashmap is "+hs);
			System.out.println(" does it contains banana and apple"+hs.containsValue("banana") + "  "+hs.containsValue("Apple"));
		    System.out.println(" does it contains fourth key   "+hs.containsKey(4) );
		    System.out.println("Hash code value of the map: "+hs.hashCode());
			
			hs.clear(); 
			System.out.println("Hash code value after clearing the map: "+hs.hashCode());  
	}

}
