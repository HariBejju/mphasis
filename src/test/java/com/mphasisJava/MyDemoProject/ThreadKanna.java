package com.mphasisJava.MyDemoProject;


class myThread implements Runnable{
	
	int start,end,delay;
	public myThread(int start, int end, int delay) {
		this.start = start;
		this.end=end;
		this.delay = delay;
	}
	public void run() {
		for(int i=start;i<=end;i++) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi from thread "+i);
		}
	}
	
}




public class ThreadKanna {

	public static void main(String args[]) {
		 myThread t1 = new myThread(1,5,2000);
		 myThread t2 = new myThread(6,10,4000);
		 
		 Thread t=new Thread(t1);
		 Thread s = new Thread(t2);
		 t.start();
		 s.start();
		 try {
			 t.join();
			 s.join();
		 }catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(" elaam nanmaikae");
	}
}
