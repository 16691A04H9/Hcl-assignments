package com.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTest {

	@Test
	void testDeposit() {
		Account a=new Account("hello",123456789,2300);
		Boolean b=a.deposit(3000);
		assertEquals(b,true);
		
	}

}
