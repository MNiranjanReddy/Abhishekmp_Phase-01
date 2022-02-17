package com.constructor;

	class Employee
	{
		String name;
		int id;
		double salary;
		long password;
		String email;
		public Employee(String name,int id,double salary)
		{
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		public Employee(long password,String email)
		{
	     	this.password=password;
			this.email=email;
		}
		public void showdetail()
		{
			System.out.println(" name:"+ name);
			System.out.println("id:"+id);
			System.out.println("salary:"+salary);
		}
		public void personal()
		{
			System.out.println("password:"+password);
			System.out.println("email:"+email);
		}
	}
	class Constructoroverload2
	{
		public static void main(String[] args) 
		{
			Employee e1= new Employee("abhi",101,1000000);
			e1.showdetail();
			Employee p1=new Employee(2345677,"abhishekmp787@gmail.com");
			p1.personal();
			Employee e2= new Employee("namitha",102,1000000);
			e2.showdetail();
			Employee p2=new Employee(2345554,"namithakssindu@gmail.com");
			p2.personal();
		}
	}


