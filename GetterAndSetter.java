package com.org.loop;

  class App{
	private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
 public class GetterAndSetter {
    public static void main(String[] args) {
		App app = new App();
		app.setName("Binod");
		app.setAge(26);
		
		System.out.println(app.getName());
		System.out.println(app.getAge());
		
	}
}