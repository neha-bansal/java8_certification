package com.ocajexam.tutorial.chapter3;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		
		//when value assigned to byte is outside it's range (i.e. -128 to 127), then it is assigned a value starting from -128 till 127.
		// just as byte a = 130 will be -126 
		// byte a = 380 will be 124 
		// byte a = 400 will be -112
		
		byte a;
		a = 10;
		System.out.println(a += 3);
		a = 15;
		System.out.println(a -= 3);
		a = 20;
		System.out.println(a *= 3);
		a = 25;
		System.out.println(a /= 3);
		a = 30;
		System.out.println(a %= 3);
		//optional as outside the scope of exam.
		a = 35;
		System.out.println(a &= 3);
		a = 40;
		System.out.println(a ^= 3);
		a = 45;
		System.out.println(a |= 3);
		a = 50;
		System.out.println(a <<= 3);
		a = 55;
		System.out.println(a >>= 3);
		a = 60;
		System.out.println(a >>>= 3);
		//End optional
		
//		System.out.println(a = (byte) 380);
	}

}
