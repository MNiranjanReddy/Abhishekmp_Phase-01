package com.PracticeprojectFileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteAndAppend {
	public static void main(String[] args)
	{
		char[] array = new char[60];
	       String data = "This is the data in the output file";
		    
			    try 
			    {
			      FileWriter output = new FileWriter("C:\\Users\\abhishekmp\\OneDrive\\Documents\\song.txt");
			      FileReader input = new FileReader("C:\\Users\\abhishekmp\\OneDrive\\Documents\\song.txt");
			      output.write(data);
		          input.read(array);
		          System.out.println("Data is written to the file.");
			      
			      System.out.println("Data in the file:");
			      System.out.println(array);
			      
			      StringBuffer str=new StringBuffer("i am the sing");
			      str.append(" i am only sing");
	              System.out.println(str);
			     
			      input.close();
			    }
			    catch(Exception e) 
			    {
			      e.getStackTrace();
			    }

	}

}

