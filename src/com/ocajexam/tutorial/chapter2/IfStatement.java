/**
* If statement allows optional use of the else branch.
* 
*			if, else(optional)
*
* if (x == 0) ; else if (x == 1) {} else {;} - works fine
*/

package com.ocajexam.tutorial.chapter2;

public class IfStatement {

	public static void main(String[] args) {
		
		boolean b;
		boolean bValue = (b = true);
		
		if (bValue) System.out.println("TRUE");
		else System.out.println("FALSE");

		//Works fine as after assignment expression evaluates to boolean value
		if (bValue = false) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		if (bValue == false) System.out.println("TRUE");
		else System.out.println("FALSE");

		//==================================================================================================//

		int i;
		int iValue = (i = 0);
		
		//Fails here since a boolean value is expected in the expression
//		if (iValue) System.out.println("TRUE");
//		else System.out.println("FALSE");

		//Fails here since a boolean value is expected in the expression
//		if (iValue = 1) System.out.println("TRUE");
//		else System.out.println("FALSE");

		//==================================================================================================//

		System.out.println("============================= Boolean Wrapper Class example =============================");

		Boolean wrapperBoolean = new Boolean("true");
		//valid
		boolean primitiveBoolean1 = wrapperBoolean.booleanValue();
		//valid due to unboxing
		boolean primitiveBoolean2 = wrapperBoolean;

		//valid because object of Boolean wrapper class will be unboxed to return the expected type.
		if (wrapperBoolean) System.out.println("TRUE");
		else System.out.println("FALSE");
		
		//==================================================================================================//

		System.out.println("============================= empty statements example =============================");

		int x= 1;
		
		if (x == 0) ; else if (x == 1) {} else {;}
	}
}