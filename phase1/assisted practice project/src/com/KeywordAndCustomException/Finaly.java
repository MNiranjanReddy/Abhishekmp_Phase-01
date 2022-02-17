package com.KeywordAndCustomException;

 class Demo {
	public static void test(int num) {
		try 
		{
			System.out.println("test starts");
			int div = num / 0;
			System.out.println("test ends");
		} 
		catch (ArithmeticException ae)// (Exception e)//(RuntimeException re)
		{
			System.out.println("invalid number");
		}
		finally 
		{
			System.out.println("finally executed");
		}
	}
}

public class Finaly {
	public static void main(String[] args) {

		Demo.test(2);
	}
}


