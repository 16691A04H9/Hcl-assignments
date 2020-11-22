package com.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondTest {

	@Test
	void testWithdraw() {
		Account a=new Account("hello",123456789,2300);
		boolean b=a.withdraw(200, 20);
		assertEquals(b,true);
	}

}
