/**
* If statement allows optional use of the else branch.
* 
*			if, else(optional)
*/

package com.ocajexam.tutorial.chapter2;

public class SwitchStatement {

	private enum clamBait {FRESH, SALTED, ARTIFICIAL};

	public static void main(String[] args) {
		
		/*switch (clamBait.valueOf(args[0])) {
			
			//the order of case statements does not matter and default can be placed anywhere.
			default:
				System.out.println("No bait");
				break;
			case FRESH:
				System.out.println("Fresh clams");
				break;
			case SALTED:
				System.out.println("Salted clams");
				break;
			case ARTIFICIAL:
				System.out.println("Artificial clams");
				break;
		}*/

		switch (args[0]) {
			
			//the order of case statements does not matter and default can be placed anywhere.
			default:
				System.out.println("No bait");
				int i;
				System.out.println(i=5);  //valid as 5 will be assigned to i and then i's value is printed on console.
				break;
			case "FRESH":
				System.out.println("Fresh clams");
				break;
			case "SALTED":
				System.out.println("Salted clams");
				break;
			case "ARTIFICIAL":
				System.out.println("Artificial clams");
				break;
		}
	}
}