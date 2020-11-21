package com.wraper;
import static java.lang.Boolean.*;
public class BooleanWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		Boolean c=new Boolean(b);
		System.out.println(c.booleanValue());
		System.out.println(compare(true,false));
		System.out.println(getBoolean("10a"));
		System.out.println(logicalAnd(true,false));
		System.out.println(logicalOr(true,false));
		System.out.println(logicalXor(true,false));
		System.out.println(valueOf(true));
		System.out.println("true");
	}

}
