/**
 * from src folder : 
 * 
 * javac -cp "C:\My Work\lib\jars\grizzly-servlet-webserver-1.9.18.jar;C:\My Work\lib\jars\jersey-server-1.3.jar" -d ../bin com\ocajexam\tutorial\chapter1\GreetingsUniverse.java - work
 * javac -cp "C:\My Work\lib\jars\*;" -d ../bin com/ocajexam/tutorial/chapter1/GreetingsUniverse.java - work
 * javac -cp "C:\My Work\lib\jars\*;" -d ../bin com.ocajexam.tutorial.chapter1.GreetingsUniverse.java - don't work
 * 
 * 
 * java -cp "C:\My Work\lib\jars\*;" com.ocajexam.tutorial.chapter1.GreetingsUniverse - work
 * java -cp "C:\My Work\lib\jars\*;" com/ocajexam/tutorial/chapter1/GreetingsUniverse - work
 * java -cp "C:\My Work\lib\jars\*;" com\ocajexam\tutorial\chapter1\GreetingsUniverse - don't work
 * 
 * ********************************************************************************************
 * 							For Earth, Mars, Venus example
 * ********************************************************************************************
 * 
 * javac -d ..\bin com\ocajexam\tutorial\chapter1\GreetingsUniverse.java	-	will compile this file along with the dependent files, as java code is available under planets dir
 * java com.ocajexam.tutorial.chapter1.GreetingsUniverse	-	will execute this class
 * 
 * ********************************************************************************************
 */
package com.ocajexam.tutorial.chapter1;

import com.ocajexam.tutorial.chapter1.planets.*;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;

//import com.sun.grizzly.http.SelectorThread;
//import com.sun.jersey.api.container.grizzly.GrizzlyWebContainerFactory;

public class GreetingsUniverse {

	public static void main(String[] args) {
		System.out.println("Hello, Universe!!!");

		
		Earth earth = new Earth();
		Mars mars = new Mars();
		Venus venus = new Venus();

//		try {
//		String baseUri = "http://localhost:9090/";
//		
//		Map<String, String> initParams = new HashMap<String, String>();
//		initParams.put("com.sun.jersey.config.property.packages", "com.restapi.websocket.cors.server.resources");
//		System.out.println("Starting grizzly...");
//		SelectorThread httpServer = GrizzlyWebContainerFactory.create(baseUri, initParams);
//		
//		System.out.println("Press any key to stop the server");
//		System.in.read();
//		httpServer.stopEndpoint();
//		
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}