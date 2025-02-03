package com.mphasisJava.MyDemoProject;

import java.util.Scanner;

interface document{
	void create();
}

class pdfdoc implements document{
	public void create() {
		System.out.println(" PDF document is created");
	}
}

class worddoc implements document{
	public void create() {
		System.out.println(" Word document is created");
	}
}


class DocFactory {
	public void create(String req) {
		if(req.equals("PDF")) {
			pdfdoc p1 = new pdfdoc();
			p1.create();
		}
		if(req.equals("Word")) {
			pdfdoc p1 = new pdfdoc();
			p1.create();
		}
	}
}



public class Factory {
	public static void main(String args[]) {
		System.out.println("Enter the choice PDF or Word");
		String t1;
		Scanner sc = new Scanner(System.in);
		t1=sc.nextLine();
		DocFactory d1 = new DocFactory();
		d1.create(t1);
		
	}
}
