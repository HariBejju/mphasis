package com.mphasisJava.MyDemoProject;

import java.util.Scanner;

class MarkEx extends Exception{
	public MarkEx(String msg) {
		super(msg);
	}

}









public class MarkException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of marks");
		int n = sc.nextInt();
		int number;
		int arr[] = new int[n];
		for(int i=1;i<=n;i++) {
			System.out.println("Enter mark "+i);
			number=sc.nextInt();
			arr[i-1]=number;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int avg = sum/n;
		try {
			if(avg<50) {
				throw new MarkEx(" Sorry u have not qualified");
			}else {
				System.out.println("Nice bro");
			}
		}
		catch(MarkEx e) {
			System.out.println(" Exception "+e.getMessage());
		}
	}
	
}
