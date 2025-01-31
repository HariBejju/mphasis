package com.mphasisJava.MyDemoProject;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void addData(String words) {
		System.out.println("User: "+ words);
		if(words.equals("Hariprasanna")) {
			System.out.println("Welcome Captain");
		}else {
			System.out.println("Cheers ");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        addData("Gokul");
    }
}
