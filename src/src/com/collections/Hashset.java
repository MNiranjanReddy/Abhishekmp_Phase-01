package com.collections;

import java.util.HashSet;

public class Hashset {

		public static void main(String[] args) {
			  HashSet<String> hs=new HashSet<String>();
				
				hs.add("Apple");
				hs.add("orange");
				hs.add("banana");
				hs.add("Pineapple");
				hs.add("Papaya");
				hs.add("Mango ");
				hs.add("Guava");
				hs.add("Lemon");
				hs.add("Watermelon");
				hs.add("Blackberry ");
				
				System.out.println("Size of Hashset is "+ hs.size());
				
			    System.out.println("add grapes , plum and cherry "+hs.add("Cherry")+ " "+hs.add("Grapes")+  " "+ hs.add("Plum"));
			    
				System.out.println("Size of Hashset is "+ hs.size());
				
			    System.out.println("remove the apple and papaya  "+hs.remove("Apple")+ " "+ hs.remove("Papaya"));
			   
				System.out.println("Does hashset contains this 'orange' element  " + hs.contains("orange"));
				
			    hs.clear();
			    
			    System.out.println("is hashset empty  " +hs.isEmpty());

		}

	}



