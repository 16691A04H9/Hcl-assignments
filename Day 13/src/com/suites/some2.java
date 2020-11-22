package com.suites;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class some2 {
	String message="akshith";
	some s=new some(message);
	@Test
	void testAppendMessage() {
		assertEquals(message,s.appendMessage());
	}

}
