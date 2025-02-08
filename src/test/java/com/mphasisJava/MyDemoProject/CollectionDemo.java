package com.mphasisJava.MyDemoProject;

import java.util.*;
public class CollectionDemo {

	public static void main(String args[]) {
		ArrayList<Integer>a = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the number "+(i+1));
			a.add(sc.nextInt());
		}
		System.out.println(a);
		Iterator<Integer>goks =a.iterator();
		while(goks.hasNext()) {
			int n = goks.next();
			if(n%2==1) {
				goks.remove();
			}
		}
		System.out.println(a);
		}
	
	
}
