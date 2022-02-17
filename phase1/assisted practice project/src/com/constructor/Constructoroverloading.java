package com.constructor;

	class Sample
	{
		public Sample()
		{
			System.out.println("zero argument constructor...");
		}
		public Sample(int a)
		{
			System.out.println("a:"+a);//no of argument
		}
		public Sample(int b,double c)
		{
			System.out.println("b:"+b);
			System.out.println("c:"+c);//data type of argument
		}
		public Sample(double d,int e)
		{
			System.out.println("d:"+d);
			System.out.println("e:"+e);//order of argument
		}
	}
	class Constructoroverloading
	{
		public static void main(String[] args) 
		{
			new Sample();
			new Sample(10);
			new Sample(20,2.2);
			new Sample(2.5,30);
		}
	}
