package com.org.loop;
                   //Constructor
class Machine{
	
	private String name;
	private String colour;
	
   public Machine(){ 
	 //this("Mahindra","White"); it's call 1st 3rd constructor then call 1st constructor.
	 System.out.println("Constructor-1 is running");  
	 
	 name= "Tata";
   }
   public Machine(String name) {
	  // this("Honda","White");
	   this.name = name;   //"this.name" is calling to -"private String name" Instant variable and 
	                       //name is calling "String name" local variable "Petrol".
	   System.out.println("Constructor-2 is running");
   }
   public Machine(String name , String colour) {
	   
	   this.name = name;
	   this.colour = colour;
	   System.out.println("Constructor-3 is running");
   }
}

public class Cars {
    public static void main(String[] args) {
		Machine m1 = new Machine();// this is run for 1st constructor
		
		Machine m2 = new Machine("Audi");// this is run for 2nd constructor
		
		Machine m3 = new Machine("Hundai", "Black");
		
	}
}
