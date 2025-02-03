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
// str1 str2 has same value so same hascode and same address since it is in scp
// str3 has same value so hashcode is same but address is in heap
// after concatinating the value changes so address is also changed