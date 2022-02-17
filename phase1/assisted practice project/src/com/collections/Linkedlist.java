package com.collections;

import java.util.LinkedList;

public class Linkedlist 
	{

		public static void main(String[] args)
		{
			 LinkedList<String> ll = new LinkedList<String>();
			
			    ll.addFirst("January");
		        ll.add(1,"feb");
		        ll.add(2,"March");
		        ll.add("April");
		        ll.add("May");
		        ll.add("june");
		        ll.add("July");
		        ll.add("August");
		        ll.add(8,"September");
		        ll.add(9,"October");
		        ll.add("November");
		        ll.addLast("December");
		         
		        for (int i = 0; i < ll.size(); i++) 
		        {
		            System.out.println(ll.get(i));
		        }
		        System.out.println("__________________");
		        System.out.println("months index value with even");
		        for (int i = 0; i < ll.size(); i++) 
		        {
		        if (i%2==0)   
		        {  
		        	 System.out.println(i +"="+ll.get(i));  
		        }  
		        }
		       
		        System.out.println("__________________");
		        System.out.println("months index value with odd");
		        for (int i = 0; i < ll.size(); i++) 
		        {
		        if (i%2!=0)   
		        {  
		        	 System.out.println(i +"="+ll.get(i));  
		        }  
		        }
		        System.out.println("first month = "+ll.getFirst()+" & last month = "+ll.getLast());
		        
		        System.out.println("birthday month removed = " +ll.remove(8));
		        
		        System.out.println("Does LinkedList contains 'winter month'? "+ll.contains("winter month"));
		}

	}



