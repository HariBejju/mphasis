package com.mphasisJava.MyDemoProject;



class Grandpa{
	void msgFromGrandpa() {
		System.out.println("grandpa to me: peraandi bathrama iruda");
	}
}

class Parents extends Grandpa{
	void msgFromParent() {
		System.out.println("parents to me: Study well and get placed in a good company");
	}
}


class Me extends Parents{
	void msgToMyself() {
		System.out.println("me to me: Paathukalaam ");
	}
}



public class MultilevelInheritance {

	public static void main(String args[]) {
		Me obj = new Me();
		obj.msgFromGrandpa();
		obj.msgFromParent();
		obj.msgToMyself();
	}
}
