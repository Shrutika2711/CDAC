package org.Assig5_Animal;
class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	public String getName() {
		return name;
	}	
}
