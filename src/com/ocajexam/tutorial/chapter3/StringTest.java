package com.ocajexam.tutorial.chapter3;

public class StringTest {

	static char[] ch;
	public static void main(String[] args) {

		String s1 = new String("String One"); // inefficent way to create a string, tested with FindBugs software(http://findbugs.sourceforge.net).
		String s2 = "String Two";
		String s3 = "String" + "Three";

//		System.out.println(ch);				//NullPointerException
		
	}

}
