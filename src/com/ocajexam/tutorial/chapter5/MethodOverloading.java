package com.ocajexam.tutorial.chapter5;

import jdk.nashorn.internal.runtime.FindProperty;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(findLowerValue(5, 8));
		System.out.println(findLowerValue(5.0, 8.0));
		System.out.println(findLowerValue(5, 8.0));
		System.out.println(findLowerValue(5.0, 8));
	}

	private static int findLowerValue(int x, int y) {
		System.out.print("from int : ");
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
	
	private static double findLowerValue(double x, double y) {
		System.out.print("from double : ");
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
}
