package com.collections;

import java.util.LinkedList;

public class Linkset {


		public static void main(String[] args)
		{
	        LinkedList<String> ll = new LinkedList<String>();
	        
	        ll.add("Apple");
			ll.add("orange");
			ll.add("banana");
			ll.add("Pineapple");
			ll.add("Papaya");
			ll.add("Mango ");
			ll.add("Guava");
			ll.add("Lemon");
			ll.add("Watermelon");
			ll.add("Blackberry ");
			System.out.println("Size  "+ll.size());    
			System.out.println("add grapes , plum and cherry "+ll.add("Cherry")+ll.add("Grapes")+ ll.add("Plum"));
	     	System.out.println("Size  "+ll.size()); 
	        System.out.println("remove Apple and Papaya "+ll.remove("Papaya")+ll.remove("Apple"));
	        System.out.println("Does List contains 'orange' "+ll.contains("orange"));
	        System.out.println("Is List empty "+ll.isEmpty());	

		}

	}



