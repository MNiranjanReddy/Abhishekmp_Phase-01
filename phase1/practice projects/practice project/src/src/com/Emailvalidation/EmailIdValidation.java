package com.Emailvalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailIdValidation {
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter vaild email: " );  
		 String email= sc.nextLine();
		 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",email));
	}

}
