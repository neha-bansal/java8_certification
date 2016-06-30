/**
 * enums are static by default.
 * enum cannot have final modifier.
 * The member enum XXX can only be defined inside a top-level class or interface or in a static context
 */
package com.ocajexam.tutorial.chapter4;

public class EnumExample {

	 enum Suit {		//enum cannot have final modifier
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	static enum MessageType {
		ERROR, INFO, DEBUG
	}

	public static void main(String[] args) {
		
		Suit suit = Suit.CLUBS;
		System.out.println(suit);
		
		MessageType msg = MessageType.DEBUG;
		System.out.println(msg);
		
		//enum TypeOfShoe {RUNNING, CROSS_TRAINING}	//The member enum TypeOfShoe can only be defined inside a top-level class or interface or in a static context
	}
	
	private void sample() {
		//enum TypeOfShoe {RUNNING, CROSS_TRAINING}	//The member enum TypeOfShoe can only be defined inside a top-level class or interface or in a static context
	}

}
