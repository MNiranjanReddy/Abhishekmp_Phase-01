package com.Maps;

import java.util.LinkedHashMap;

public class Linkmap {
	public static void main(String[] args) {
		
		 LinkedHashMap<Integer, String> ll = new LinkedHashMap<Integer, String>();
		 
		 	ll.put(1, new String("Apple"));
			ll.put(2, new String("orange"));
			ll.put(3, new String("banana"));
			ll.put(4, new String("Pineapple"));
			ll.put(5, new String("Papaya"));
			ll.put(6, new String("Mango "));
			ll.put(7, new String("Guava"));
			ll.put(8, new String("Lemon"));
			ll.put(9, new String("Watermelon"));
			ll.put(10, new String("Blackberry "));
			
			System.out.println("Contents of LinkedHashMap : " + ll);
		    System.out.println("\nValues of map after iterating over it : ");
		        
		    for (Integer key :ll.keySet()) 
		    {
		        System.out.println(key + ":\t" + ll.get(key));
		    }
			
			System.out.println("hashmap is "+ ll);
			System.out.println( "remove 4 and 7 "+ll.remove("4") +ll.remove("7"));
			 System.out.println("After removal process, the hashmap is "+ll);
			 System.out.println(" does it contains banana and apple"+ll.containsValue("banana") + "  "+ll.containsValue("Apple"));
			 System.out.println(" does it contains fourth key   "+ll.containsKey(4) );
			 System.out.println("Hash code value of the map: "+ll.hashCode());
			
			  ll.clear(); 
			  System.out.println("Hash code value after clearing the map: "+ll.hashCode());  
			
	}

}
