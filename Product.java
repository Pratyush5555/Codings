package com.org.loop;

class About{
	public final static String colour= "Black"; 
	
	public String name;// instant variables or non static variables
	public static String description;// static variables
	
	public void showName() {
		System.out.println(description + ":" + name);
	}
	public static void showInfo() {
		System.out.println("Hello");
	}
	
}

public class Product {
     public static void main(String[] args) {
		
    	 About about = new About();
    	 
    	 About.description = "it is wooden table";// we can write this because Description is static variables. 
    	System.out.println(About.description);
    	
    	 about.name="Table";
    	 about.showName();
    	 
    	About.showInfo();// beacuse showInfo is static method. 
    	System.out.println(About.colour);
	}
}
