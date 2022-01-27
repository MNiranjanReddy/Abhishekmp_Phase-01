package com.collections;

import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) 
	{
		 System.out.println (Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}","firstname@gmil.com"));
		 System.out.println (Pattern.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,3}","namithaa@gmail.com"));
		 System.out.println (Pattern.matches("[a-z0-9]+@[a-z]+\\.edu\\.[a-z]{2,3}","abhishek@co.edu.com"));
		 System.out.println (Pattern.matches("^\\+91\\d{10}$","+918660516897"));
		 System.out.println (Pattern.matches("[A-Z0-9a-z]{10}","Nami02abhi"));
	}

}
