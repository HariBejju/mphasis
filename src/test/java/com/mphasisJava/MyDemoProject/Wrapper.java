package com.mphasisJava.MyDemoProject;

interface Parent{
	float area(float value);
	float perimeter(float value);
}


class Circle implements Parent{
	public float area(float value) {
		return 3.14f*value*value;
	}
	public float perimeter(float value) {
		return 3.14f*value*2;
	}
}

class Square implements Parent{
	public float area(float value) {
		return value*value;
	}
	public float perimeter(float value) {
		return 0.0f;
	}
}

public class Wrapper{
	public static void main(String args[]) {
		Square r1 = new Square();
		System.out.println(r1.area(5));
		Circle c1 = new Circle();
		System.out.println(c1.area(5));
	}
}