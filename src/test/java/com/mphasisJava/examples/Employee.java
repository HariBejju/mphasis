package com.mphasisJava.examples;

public class Employee{
	int id,salary;
	String name;
	public Employee(int id, String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void increment(int inc) {
		salary=salary+(salary)/inc;
	}
	public static void main(String args[]) {
		Employee e1 = new Employee(1,"Hariprasanna",500000);
		System.out.println("Welcome!");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println("Salary before increment:"+e1.salary);
		e1.increment(10);
		System.out.println("Salary after increment:"+e1.salary);
	}
}