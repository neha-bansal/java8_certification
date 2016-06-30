package com.ocajexam.tutorial.misc;

public class LocalVariableScopeTest {

	public static void main(String[] args) {
		
		scopeTest1();
		
		scopeTest2();
	}
	
	private static void scopeTest1() {
		
//		why this code is not working
//		because the i declared by 'int i = 5' is available in if block as well, so declaring another int i is duplicate variable. 
		int i = 5;
		System.out.println(i);
		
		int x = 0;
		if (x == 0) {
//			int i = 10;				//duplicate variable i
			System.out.println(i);
		}
	}
	
	private static void scopeTest2() {
		
//		and why this is working fine
//		because i declared by 'int i = 10' has it's scope available only in if block, so we can declare another int i after if block.
		int x = 0;
		if (x == 0) {
			int i = 10;
			System.out.println(i);
		}

		int i = 5;
		System.out.println(i);
	}

}
