package com.ocajexam.tutorial.chapter4;

import java.text.NumberFormat;

public class PrimitivesCasting {

	private static boolean b = true;
	private static char c = 'a';
	
	private static byte bt1 = 12;
//	private static byte bt2 = c;		//wrong, need to explicitly cast from char to byte
	
	private static short s1 = 100;
	private static short s2 = bt1;
//	private static short s3 = c;		//wrong, need to explicitly cast from char to short
	
	private static int i1 = 234;
	private static int i2 = bt1;
	private static int i3 = s1;
	private static int i5 = c;
//	private static int i4 = 234l;		//wrong, need to explicitly cast from long to int
//	private static int i6 = 234.5f;		//wrong, need to explicitly cast from float to int
//	private static int i7 = 566.9d;		//wrong, need to explicitly cast from double to int
	
//	private static short s3 = i1;		//wrong, need to explicitly cast from int to short, similarly for long, float and double
	
	private static long l1 = 5578787878l;
	private static long l2 = i1;
//	private static long l3 = 222f;		//wrong, need to explicitly cast from float to long, similarly for double
	
	private static float f1 = 111;
	private static float f2 = 222l;
	private static float f3 = 222;
	private static float f5 = 39921523.12f;
//	private static float f4 = 333d;		//wrong, need to explicitly cast from double to float
	
	private static double d1 = 289.12d;
	private static double d2 = 289D;
	private static double d3 = 289f;
	private static double d4 = 289289289;
	private static double d5 = 289289289289L;
	
	public static void main(String[] args) {

		System.out.println("Primitives Casting Demo");
		System.out.println(NumberFormat.getCurrencyInstance().format(f5));
		
	}

}
