package com.suites;

import static org.junit.Assert.*;

import org.junit.Test;

public class some1 {
	String message="akshith";
	some s=new some(message);
	@Test
	 void testPrintMessage() {
		assertEquals(message,s.printMessage());
	}

}
