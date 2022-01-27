package com.project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class project1{	
	Scanner in = new Scanner(System.in);//input from user

	
	public void creatfile()
	{
		
        try {  
        	
        	
        	System.out.println("write the file path and file name to craete...");
        	String input = in.nextLine();
        	File file = new File(input);
        	/*create the file code below*/
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");    
	            } 
	            else 
	            {                   
	                if(file.exists())
	              
	                {
	                    
	                	System.out.println("File already exists.");
	                }
	                else
	                {
	                	System.out.println("File doesnot exists.");
	                }
	             
	               
	            }  
	        } 
		   catch (IOException e) 
		   {  
	            e.printStackTrace();  
	        }  	
        
        
		}
	public void listingfiles()
	{
		 try {
			  System.out.println("enter the file path to list");
			  String input = in.nextLine();
	            File file = new File(input);
	  
	            // Get all the names of the files present
	            // in the given directory
	            String[] files = file.list();
	  
	            System.out.println("Files are:");
	  
	            // Display the names of the files
	            for (int i = 0; i < files.length; i++) {
	                System.out.println(files[i]);
	            }
	        }
	        catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
		
 		
	}
	public void  deletefile( )
	{
		
    	System.out.println("write the file path to delete :");
    	String input = in.nextLine();
    	File file = new File(input);
    	
    	 if(file.delete())
         {
             System.out.println("File deleted successfully");
         }
         else
         {
             System.out.println("Failed to delete the file");
         }
	}
	public void searchfile()
	{
		
    	System.out.println("write the file path which you want to search:");
    	String input = in.nextLine();
    	File file = new File(input);
    	if (file.exists())
    		 
            // Show if the file exists
            System.out.println("file Exists");
        else
 
            // Show if the file does not exists
            System.out.println("Does not Exists");
	}
	public void exit()
	{
		// exit form switch code
		System.out.println("exit...");
        System.exit(0);
	}
	
}
public class Phase1
{
	public Phase1(int n) {}

	public static void main(String[] args)
	{
		 try (Scanner scan = new Scanner(System.in)) {
			/* Perform file Operations */        
	        char ch;
	        do{
	        	System.out.println("------WELCOME TO LOCKERS.COM------");
	            System.out.println("file operations select the one");
	            System.out.println("1. create file");
	            System.out.println("2. list file");
	            System.out.println("3. search file");
	            System.out.println("4. delete file");
	            System.out.println("5. exit");
	            
	            int choice = scan.nextInt();
	            project1 a= new project1();
	            switch (choice)
	            {
	            case 1 :
	            	try {
					a.creatfile();                   
	                break;        
	            	}
	            	 catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }
	            case 2 : 
	            	 try {
	                a.listingfiles();
	                break; 
	            	 }
	                catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }
	            case 3 : 
	            	try {
	               a.searchfile();
	                break;
	            	}
	            	catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }
	            case 4 : 
	            	try {
	                a.deletefile();
	                break;
	            	}
	            	catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }
	            case 5 : 
	                a.exit();
	                break;                                                  
	            default : System.out.println("Wrong Entry \n ");
	                break;
	            }           
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);
	 
	        } while (ch == 'Y'|| ch == 'y');
		} 
	}

}


