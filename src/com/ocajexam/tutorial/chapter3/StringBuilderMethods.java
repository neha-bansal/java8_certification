package com.ocajexam.tutorial.chapter3;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		StringBuilder mateyMessage = new StringBuilder(new StringBuffer("Shivers!"));
		mateyMessage.append(" Bad Storm!");
		
		System.out.println(mateyMessage + ":" + mateyMessage.capacity() + ":" + mateyMessage.length());
		
		System.out.println("=========== append() ================");
		StringBuilder e = new StringBuilder("Example ");
		e.append(" ").append("1");
		e.append(" ").append('\u0031');
		e.append(" ").append(259);
		e.append(" ").append((short) 32770);
		e.append(" ").append(2L);
		e.append(" ").append(1f);
		e.append(" ").append(2d);
		e.append(" ").append(true);
		e.append(" ").append(new StringBuffer("2"));
		System.out.println(e);
		
		
		System.out.println("=========== insert() ================");
		StringBuilder e1 = new StringBuilder("Shiver Me Timbers");
		
		e1.insert(17, " and Bricks.");
		e1.insert(18, new char[] {'S', 't', 'o', 'r', 'm', ' '}, 2, 4);
		System.out.println(e1 + ":" + e1.length());
		e1.insert(e1.length(), true);
//		e1.insert(e1.length() + 1, 11);		// java.lang.StringIndexOutOfBoundsException: String index out of range
//		e1.insert(-1, "STOP!!! ");			// java.lang.StringIndexOutOfBoundsException: String index out of range
		System.out.println(e1);
		
		
		System.out.println("=========== delete() ================");
		StringBuilder e2 = new StringBuilder("Shiver Me Timbers!");
		
		e2.delete(6, 16);
		System.out.println(e2);

		e2.delete(4, 11);
		System.out.println(e2);
		
//		e2.delete(-1, 4);			// java.lang.StringIndexOutOfBoundsException: String index out of range
//		System.out.println(e2);
		
		e2.delete(2, 30);			//delete from 2nd offset till end, as end > string length.
		System.out.println(e2);
		
		e2.delete(2, 30);			//delete nothing
		System.out.println(e2);
		
		
		System.out.println("=========== delete() ================");
		StringBuilder e3 = new StringBuilder("Shiver Me Timbers!");
		
		e3.deleteCharAt(17);
		System.out.println(e3);
		
//		e3.deleteCharAt(18);		// java.lang.StringIndexOutOfBoundsException: String index out of range
//		System.out.println(e3);
		
//		e3.deleteCharAt(-1);		// java.lang.StringIndexOutOfBoundsException: String index out of range
//		System.out.println(e3);
		
		
		System.out.println("=========== delete() ================");
		StringBuilder e4 = new StringBuilder("Part");
		
		e4.reverse();
		System.out.println(e4);
		
		
	}

}
