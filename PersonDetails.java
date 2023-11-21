package com.org.loop;

class Person{
	String name;
	int age;
	
	void speak() {
		for(int i=0;i<=2;i++) {
		System.out.println("My name is: "+ name +" "+ "My age is: "+ age);
	}
	
  }
	public void move(String direction,double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}

}
public class PersonDetails {
   public static void main(String[] args) {
	Person p = new Person();
	p.name ="Ram";
	p.age =25;
	p.speak();
	p.move("west", 35);
	
	System.out.println(p.name);
	System.out.println(p.age);
	   
   }
}
