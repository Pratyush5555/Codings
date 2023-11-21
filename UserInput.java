package com.org.loop;

import java.util.Scanner;



public class UserInput {
	public static void main(String[] args) {
	
  //Create scanner object	
  Scanner sc = new Scanner (System.in);
  
  //Output the prompt
  System.out.println("enter what do you want : ");
   
  //wait for user to enter somthing
   int value = sc.nextInt();
   
   //what is the output
   System.out.println("the output is :" + value);
	}
}
