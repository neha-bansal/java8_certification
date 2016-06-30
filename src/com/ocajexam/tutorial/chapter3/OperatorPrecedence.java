package com.ocajexam.tutorial.chapter3;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int x = 10;
		
		int y = 10 + ++x;
		
		System.out.println("x: " + x + ", y:" + y); 
		
		y = ++x;
		
		System.out.println("x: " + x + ", y:" + y); 
		
		//=========================================================================================
		
//		System.out.print(true | false & true + ", ");	//compilation error, as + has more precedence over &, so for & onee operans is boolean and other is String which is wrong.
		System.out.print((true | false & true) + ", ");	//add parentheses around the boolean statement to correct the upper one.
		System.out.println(false & true | true);
		System.out.println(true + " ");
		
		//=========================================================================================
		
		int score = 10;
		System.out.println("Score: " + score * 11);
		

	}

}
