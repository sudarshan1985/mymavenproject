package com.codebind;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestApp {

	     String Message = "Hello world";
	     App a1 = new App();
		 @Test
		   public void testPrintMessage() {	
		      System.out.println("Inside testPrintMessage()");    
		      assertEquals(Message, a1.helloWorld());     
		   }
		
	}


