/**
* for each is also known a for in statement.
* 
*/

package com.ocajexam.tutorial.chapter2;

import java.util.List;
import java.util.ArrayList;

public class ForEachStatement {

	public static void main(String[] args) {
		
		List<Float> fishLengthList = new ArrayList<Float>();
		fishLengthList.add((float) 10.0);
		fishLengthList.add(new Float(15.5));
		fishLengthList.add(18.0F);
		fishLengthList.add(29.5f);
		fishLengthList.add((float) 45.5);

		for (Float fishLength : fishLengthList) {
			if (fishLength > 28.0) {
				System.out.println(fishLength);
			}
		}
	}
}