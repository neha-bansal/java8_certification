/**
 * Compiler performs the left-to-right association for the additive and string concatenation operators.
 * 
 */
package com.ocajexam.tutorial.chapter3;

public class StringConcatenation {

	public static void main(String[] args) {
		float reale = .007812f;
		float escudo = .125f;
		
		//first two floats are added and then compiler takes the string representation of the result and 
		//concatenate it with the given string.
		System.out.println(reale + escudo + " % of one gold doubloon");	//values added
		
		System.out.println((reale + escudo) + " % of one gold doubloon");	//parentheses included, values added
		
		System.out.println("% of one gold doubloon : " + (reale + escudo));	//parentheses included, values added
		
		//values not added
		//moving from left to right compiler takes the string and concatenates it with the string 
		//representation of the reale float variable and similarly concatenate it with escudo float variable.
		System.out.println("% of one gold doubloon : " + reale + escudo);	
	}

}
