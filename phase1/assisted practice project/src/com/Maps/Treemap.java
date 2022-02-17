package com.Maps;

import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		 TreeMap<String, Integer> hs = new TreeMap<String, Integer>();
		hs.put("Apple",1);
		hs.put("orange",2);
		hs.put("banana",3);
		hs.put("Pineapple",4);
		hs.put("Papaya",5);
		hs.put("Mango ",6);
		hs.put("Guava",7);
		hs.put("Lemon",8);
		hs.put("Watermelon",9);
		hs.put("Blackberry ",10);
		
		  for(String key: hs.keySet()){
				System.out.println(key  +" : "+ hs.get(key));
	        }
		
		
			System.out.println( "remove 4 and 7 "+hs.remove("4") +hs.remove("7"));
			 System.out.println("After removal process, the hashmap is "+hs);
			 
			 System.out.println(" does it contains banana and apple  "+hs.containsKey("banana") +
					 "  "+hs.containsKey("Apple"));
			 System.out.println(" does it contains fourth key   "+hs.containsValue(4) );
			 System.out.println("Hash code value of the map: "+hs.hashCode());
			
			  hs.clear(); 
			  System.out.println("Hash code value after clearing the map: "+hs.hashCode());  

	}

}
