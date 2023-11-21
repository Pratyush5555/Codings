package com.org.loop;

import java.util.Scanner;

public class SwitchCase {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a command");
	String text = sc.nextLine();
	switch (text) {
	case "start" :
		System.out.println("play the music");
		break;
		
	case "stop" :
		System.out.println("stop the music");
		break;
		
	default:
		System.out.println("can not find");
		
	}

		
	
  }
}
