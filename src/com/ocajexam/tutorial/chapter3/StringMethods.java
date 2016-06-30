package com.ocajexam.tutorial.chapter3;

import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) {

		String pirateMessage = "  Buried Treasure Chest! ";
		
		System.out.println("=========== charAt() ================");
		System.out.println(pirateMessage.charAt(0));
		System.out.println(pirateMessage.charAt(2));
		System.out.println(pirateMessage.charAt(23));
		System.out.println(pirateMessage.charAt(24));
//		System.out.println(pirateMessage.charAt(-1));	// java.lang.StringIndexOutOfBoundsException: String index out of range
//		System.out.println(pirateMessage.charAt(25));	// java.lang.StringIndexOutOfBoundsException: String index out of range
		
		
		System.out.println("=========== indexOf() ================");
		System.out.println(pirateMessage.indexOf('T', 9));		//fromIndex also starts from 0.
		System.out.println(pirateMessage.indexOf("sure", 9));
		System.out.println(pirateMessage.indexOf('r', -1));	//If fromIndex is -1, it is considered as 0
		System.out.println(pirateMessage.indexOf('r', 25));	//If fromIndex is greater than the length of this string, then it is considered as it is equal to the length of this string: -1 is returned. 

		
		System.out.println("=========== replace(), replaceAll(), replaceFirst() ================");
		StringBuffer sb = new StringBuffer("Buried");
		System.out.println(pirateMessage.replace(sb, "b"));	//replace method can take the StringBuffer/StringBuilder object as an argument.
		
		System.out.println(pirateMessage.replace("[a-z]", "b"));	//it will not replace the pirateMessage string, as replace does not take the regex exp
		System.out.println(pirateMessage.replace("\u0020", "b"));	// "\u0020" is the unicode character for space
		
		System.out.println(pirateMessage.replaceAll("[a-z]", "b"));
		
		System.out.println("aaaa".replaceFirst("aa", "b"));
		
		
		System.out.println("=========== startsWith() ================");
		System.out.println(pirateMessage.startsWith("  Buried"));
		System.out.println(pirateMessage.startsWith("Treasure", 8));
		System.out.println(pirateMessage.startsWith("Treasure", 9));	//equals to pirateMessage.substring(9).startsWith("Treasure")
		
		
		System.out.println("=========== endsWith() ================");
		System.out.println(pirateMessage.endsWith("  Buried"));
		System.out.println(pirateMessage.endsWith("Treasure"));
		System.out.println(pirateMessage.endsWith("Chest! "));	
		System.out.println(pirateMessage.endsWith(" "));	
		
		
		System.out.println("=========== substring() ================");
		System.out.println(pirateMessage.substring(8));
		System.out.println(pirateMessage.substring(8, 20));
		System.out.println(pirateMessage.substring(10, 10));
		System.out.println(pirateMessage.substring(9, 10));
//		System.out.println(pirateMessage.substring(-1, 10));	// java.lang.StringIndexOutOfBoundsException: String index out of range
//		System.out.println(pirateMessage.substring(10, 30));	// java.lang.StringIndexOutOfBoundsException: String index out of range
//		System.out.println(pirateMessag.substring(10, 9));		// java.lang.StringIndexOutOfBoundsException: String index out of range
		
		
		System.out.println("=========== trim() ================");
		System.out.println("\u0020aaa :" + "\u0020aaa".trim());	// "\u0020" is the unicode character for space
		System.out.println(pirateMessage.trim());
		
		
		System.out.println("=========== toLowerCase() ================");
		System.out.println(pirateMessage.toLowerCase());
		System.out.println(pirateMessage.toLowerCase(new Locale("fr", "CA")));
		
		
		System.out.println("=========== toUpperCase() ================");
		System.out.println(pirateMessage.toUpperCase());
		System.out.println(pirateMessage.toUpperCase(new Locale("fr", "CA")));
		
		System.out.println(pirateMessage.concat("pious"));
		System.out.println(pirateMessage);
	}

}
