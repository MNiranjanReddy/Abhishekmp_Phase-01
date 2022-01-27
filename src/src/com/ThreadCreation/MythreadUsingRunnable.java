package com.ThreadCreation;

public class MythreadUsingRunnable implements Runnable {

		@Override
	 	public void run()
	 	{
			for(int i=0;i<=4;i++)
			{
				System.out.println(i);
			}
	    }
	 	public static void main(String args[])
	 	{
	 		MythreadUsingRunnable mt = new  MythreadUsingRunnable();
	 		Thread th =new Thread(mt);
	  		th.start();
	 	}


	}



