package com.mphasisJava.MyDemoProject;

import java.util.Scanner;

public class basics {
	public static void main(String args[]) {
		System.out.println(" Enter the number of names ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String names[] = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			
			System.out.println(" Enter the name of "+(i+1)+ "th user");
			String name = sc.nextLine();
			names[i]=name;
		}
		
		System.out.println(" These are the names :");
		for(String s:names) {
			System.out.println(s);
		}
	}
}
