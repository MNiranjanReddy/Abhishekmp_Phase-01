package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String[] args) 
	{
            File file = new File("C:\\Users\\abhishekmp\\OneDrive\\Documents\\music.txt");
            boolean result;
            try
            {
            	result=file.createNewFile();
            	if (result) 
            	{  
                System.out.println("New File is created!" + file.getCanonicalPath());
            	} 
            else 
                {
                    System.out.println("File already exists." + file.getCanonicalPath());	 
                }
            
            } 
	   catch (IOException e) 
	   {  
            e.printStackTrace();  
       } 
	}

}
