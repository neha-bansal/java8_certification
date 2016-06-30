/**
* java com.ocajexam.tutorial.chapter1.PropertiesManager -list_prop java.specification.vendor
* java -Dnew_property1=new_value1 com.ocajexam.tutorial.chapter1.PropertiesManager -list_prop new_property1
* java com.ocajexam.tutorial.chapter1.PropertiesManager -list_all
* 
* 
* ********************************************************************************************
* 							ABOUT -VERSION OPTION
* ********************************************************************************************
* 
* java -version
* java -version PropertiesManager	-	prints java version, ignore the second argument (i.e. PropertiesManager)
* java PropertiesManager -version	-	take 1st argument 'PropertiesManager' as a class to execute and -version as an argument to this class
* 
* ********************************************************************************************
*/
package com.ocajexam.tutorial.chapter1;

import java.util.Properties;

public class PropertiesManager {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.exit(0);
		}
		Properties properties = System.getProperties();
		properties.setProperty("new_property2", "new_value2");
		switch(args[0]) {
			case "-list_all":
				properties.list(System.out);
				break;
			case "-list_prop":
				System.out.println(properties.getProperty(args[1]));
				break;
			default:
				System.out.println("Usage: java PropertiesManager [-list_all]");
				System.out.println("       java PropertiesManager [-list_prop [property]]");
		}
	}
}