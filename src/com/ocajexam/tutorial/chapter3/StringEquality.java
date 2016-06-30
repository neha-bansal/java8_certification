package com.ocajexam.tutorial.chapter3;

public class StringEquality {

	public static void main(String[] args) {

		String msg1 = "WALK THE PLANK!";
		String msg2 = "WALK THE PLANK!";
		String msg3 = ("WALK THE PLANK!");
		String msg4 = new String("WALK THE PLANK!");
		
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equals(msg4));
		System.out.println(msg2.equals(msg3));
		System.out.println(msg2.equals(msg4));
		System.out.println(msg3.equals(msg4));
		
		
		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg1 == msg4);
		System.out.println(msg2 == msg3);
		System.out.println(msg2 == msg4);
		System.out.println(msg3 == msg4);
		
		System.out.println("========== compare String and StringBuilder =================");
		StringBuilder sb = new StringBuilder("WALK THE PLANK!");
		System.out.println(msg1.equals(sb));			//return false, as String and StringBuilder are not of compatible types
		System.out.println(msg1.equals(sb.toString()));
	}

}
