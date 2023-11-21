package com.org.loop;

import java.util.Scanner;

public class Multi_DimensionalArrays {
   public static void main(String[] args) {
	   
	//2-D Array
	   Scanner sc = new Scanner(System.in);
	   System.out.println("first num");
	   int rows = sc.nextInt();
	   System.out.println("second num");
	   int cols = sc.nextInt();
	   
	   int[][] numbers  = new int[rows][cols];
	   System.out.println("enter num");
	   //input
	   // loop for rows
	   for(int i= 0; i<rows;i++) {
		   //loop for cols
		   for(int j = 0;j<cols;j++) {
			  numbers[i][j] = sc.nextInt(); 
		   }
	   }
	   System.out.println("matrix:");
	   
	   //output
	   for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
		    	
		        System.out.print( numbers[i][j]+" ");
		    }
		    System.out.println();
		}
	   
	   
	   
 }
}
