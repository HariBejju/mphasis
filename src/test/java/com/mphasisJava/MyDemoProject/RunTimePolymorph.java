package com.mphasisJava.MyDemoProject;


class Animal{
	void eat() {
		System.out.println(" Animals eating");
	}
}


class Dog extends Animal{
	void eat() {
		System.out.println(" Dog is eating");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println(" Cat is eating");
	}
}
public class RunTimePolymorph {
	public static void main(String args[]) {
		System.out.println("naathaanda leo");
		Dog d1 = new Dog();
		d1.eat();
		Cat c1 = new Cat();
		c1.eat();
	}
	
	
}
