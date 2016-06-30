/**
 * A floating-point number will lose precision as the number becomes larger.
 * float and double can handle the precision till one point only.
 * that's why currency and floating-point numbers should never be stored as float or double.
 * for this BigDecimal should be used, as it guarantee precision.
 * BigDecimal can store any number, it is not as fast to use as other primitives, but it provides accuracy. 
 */
package com.ocajexam.tutorial.chapter4;

import java.text.NumberFormat;

public class FloatingPointNumbersPrecisionIssue {

	public static void main(String[] args) {

		float f1 = 19801216.0f;
		float f2 = 20120307.12f;
		float f3 = f1 + f2;
		
		//outputs £39,921,524.00 instead of £39,921,524.12, here float primitive lose precision.
		//this is because the precision needed is more than what float is able to provide.
		System.out.println(NumberFormat.getCurrencyInstance().format(f3));
		System.out.println(f3);
		
		
		//if double is used instead of float the correct output will be displayed i.e. £39,921,523.12 
		//because the numbers precision is increased.
		//this is because the precision needed is within the bounds of double.
		//but if precision is increased, double will also have the lose precision problem.
		double d1 = 19801216.0d;
		double d2 = 20120307.12d;
		double d3 = d1 + d2;
		
		System.out.println(NumberFormat.getCurrencyInstance().format(d3));
		System.out.println(d3);
	}

}
