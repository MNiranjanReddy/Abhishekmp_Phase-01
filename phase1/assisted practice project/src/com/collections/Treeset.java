package com.collections;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		 TreeSet<String> treeSet = new TreeSet<String>();       
	        
	        treeSet.add("Apple");
	        treeSet.add("orange");
	        treeSet.add("banana");
	        treeSet.add("Pineapple");
	        treeSet.add("Papaya");
	        treeSet.add("Mango ");
	        treeSet.add("Guava");
	        treeSet.add("Lemon");
			treeSet.add("Watermelon");
			treeSet.add("Blackberry ");
			
			
			System.out.println("Size  "+ treeSet.size());
	        System.out.println("TreeSet is : " + treeSet);
	      
	        System.out.println("does it contain orange  "+treeSet.contains("orange"));
	        System.out.println("add grapes , plum and cherry "+treeSet.add("Cherry")+ " "+treeSet.add("Grapes")+  " "+ treeSet.add("Plum"));
	        System.out.println("Size  "+ treeSet.size());
	        System.out.println("removing Apple : " +treeSet.remove("Apple") );
	        System.out.println("removing Papaya : " +treeSet.remove("Papaya") );
	        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());

	}

}
