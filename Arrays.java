package com.org.loop;

public class Arrays {
    public static void main(String[] args) {
	
		int[] values= new int[4];//value.lenght is accept the length (4),which is present in line no 7th.
		System.out.println(values[0]);
		System.out.println("------");
		
		values[0]= 10;
		values[1]= 20;
		values[2]= 30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println("------");
		
		for(int i = 0 ; i<values.length ; i++) {
			System.out.println(values[i]);
		}
		System.out.println("------");
		
		int [] numbers= {2,3,4,7};//numbers.length use 23rd no line length.
		for(int i= 0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("----------Array String------------");
		
		String[] words = new String[2];
		words[0]= "simple";
		words[1]= "word";
		
		System.out.println(words[1]);
		System.out.println("-------");
		
		String[] fruits = {"apple","banana","mango","orange"};
		
	    for(String fruit: fruits) {
			System.out.println(fruit);
		}
	    System.out.println("  ");
	    System.out.println(fruits[3]);
		
	}
}
