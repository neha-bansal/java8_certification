/**
* Labeled statement should be used sparingly(limited)
* 
*/

package com.ocajexam.tutorial.chapter2;

public class LabeledStatement {

	public static void main(String[] args) {
//		labeledBreakTest();
		labeledContinueTest();
	}

	private static void labeledBreakTest() {
		myBreakLabel:
			while(true){
				System.out.println("while loop 1");
				while(true){
					System.out.println("while loop 2");
				while(true){
					System.out.println("while loop 3");
					break myBreakLabel;
				}
			}
		}
	}

	private static void labeledContinueTest() {
		myContinueLabel:
			while(true){
				System.out.println("while loop 1");
				while(true){
					System.out.println("while loop 2");
				while(true){
					System.out.println("while loop 3");
					continue myContinueLabel;
					//while(true){
					//	System.out.println("while loop 4");
					//}
				}
			}
		}
	}
}