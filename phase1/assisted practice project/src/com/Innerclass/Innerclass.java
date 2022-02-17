package com.Innerclass;

public class Innerclass {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner
	{  		
	 //private int data=20;
	  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	 } 
	class inner2
	{
		void message()
		{
			System.out.println("i am inside the innermost class method");
		}
	}

	public static void main(String[] args)
	{
		Innerclass obj=new 	Innerclass();     // creating object of Outer class
		  
		Innerclass.Inner in=obj.new Inner();   // creating object of Inner class
		  in.msg();  
		  in.display(); 
		  
		  Innerclass.inner2 a=obj.new inner2();
		  a.message();

	}

}
