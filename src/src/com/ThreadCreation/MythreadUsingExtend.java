package com.ThreadCreation;

public class MythreadUsingExtend extends Thread {
	@Override
 	public void run()
 	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
    }
 	public static void main(String args[])
 	{
 		MythreadUsingExtend mt = new  MythreadUsingExtend();
  		mt.start();
 	}


}
