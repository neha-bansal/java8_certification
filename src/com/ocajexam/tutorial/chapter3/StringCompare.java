package com.ocajexam.tutorial.chapter3;

public class StringCompare {

	public static void main(String[] args) {

		String eggs1 = "Cackle fruit";
		String eggs2 = "Cackle fruit";
		
		System.out.println(eggs1.compareTo(eggs2));				// 0
		System.out.println("Cackle truit".compareTo(eggs2));	// >0
		System.out.println(eggs1.compareTo("Cackle truit"));	// <0
	}

}
