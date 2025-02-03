package com.mphasisJava.MyDemoProject;



class Sports{
	public void play(String words) {
		
	}
}

class Football extends Sports{
	@Override
	public void play(String words) {
		System.out.println(" Come lets play "+words);
	}
}

class BasketBall extends Sports{
	@Override
	public void play(String words) {
		System.out.println(" Come lets play "+words);
	}
}
class Rugby extends Sports{
	@Override
	public void play(String words) {
		System.out.println(" Come lets play "+words);
	}
}
public class StaticMethod{
	
	public static void main(String[] args) {
		Football f = new Football();
		f.play("Football");
		BasketBall b = new BasketBall();
		b.play("BasketBall");
		Rugby r = new Rugby();
		r.play("Rugby");
	}
}