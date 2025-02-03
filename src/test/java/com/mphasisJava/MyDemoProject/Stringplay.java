package com.mphasisJava.MyDemoProject;

public class Stringplay {
	public static void main(String args[]) {
		String str1="hello";
		String str2="hello";
		String str3 = new String("hello");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		str1=str1.concat("world");
		System.out.println(str1.hashCode());
		System.out.println(str1==str2);
	}
	
}
