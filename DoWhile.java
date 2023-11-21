package com.org.loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("enter a number");
			i = sc.nextInt();
		
		}
		while(i != 5);
		System.out.println("find 5");
		
	}
}
