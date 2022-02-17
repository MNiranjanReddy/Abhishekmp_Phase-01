package com.Typecasting;

public class Typecastexample {
	public static void main(String[] args) 
	{
		
		String str = "25";//input string 
		 try {
	        	byte num =Byte.parseByte(str);
	        	 System.out.println(num); // output = 25
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
		 try {
	        	short num =Short.parseShort(str);
	        	 System.out.println(num); // output = 25
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
	        
	        try{
	            int number = Integer.parseInt(str);
	            System.out.println(number); // output = 25
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
	        
	        try {
	        	long num =Long.parseLong(str);
	        	 System.out.println(num); // output = 25;
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
	        
	        try {
	        	float num =Float.parseFloat(str);
	        	 System.out.println(num); // output = 25
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
	        try {
	        	double num =Double.parseDouble(str);
	        	 System.out.println(num); // output = 25
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
	        
	        
	        for(int i=0; i<str.length();i++){  
	            char c = str.charAt(i);  
	            System.out.println("char at "+i+" index is: "+c); 
	        }
	        
	        boolean b1=Boolean.parseBoolean(str);  
	        System.out.println(b1);

				

	}

}
