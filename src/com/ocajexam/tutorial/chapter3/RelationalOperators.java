package com.ocajexam.tutorial.chapter3;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// char primitives evaluation with relational operators 
		
		boolean b1 = 'A' < 'B';		//character literal
		System.out.println(b1);
		
		boolean b2 = '\u0041' < '\u0042';		//unicode literal
		System.out.println(b2);
		
		boolean b3 = 0x0041 < 0x0042;		//hexadecimal literal
		System.out.println(b3);
		
		boolean b4 = 65 < 66;		//Integer literal
		System.out.println(b4);
		
		boolean b5 = 0101 < 0102;		//Octal literal
		System.out.println(b5);
		
		boolean b6 = '\101' < '\102';		//Octal literal
		System.out.println(b6);
		
		boolean b7 = 'A' < 0102;		//character and Octal literal
		System.out.println(b7);
		
		boolean b8 = '\u0041' < 0x0042;		//unicode and hexadecimal literal
		System.out.println(b8);
	}

}
