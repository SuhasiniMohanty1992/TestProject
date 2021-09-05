package com.satya_mallick;

import org.apache.log4j.Logger;

public class App {

	   static Logger log = Logger.getLogger(App.class.getName());

	public String Sample()
	{
		return "Sample";
	}
	
	public static void main(String[] args) {
		System.out.println("Maven Projct");
		  log.debug("Hello this is a debug message");
	      log.info("Hello this is an info message");
	}
}
