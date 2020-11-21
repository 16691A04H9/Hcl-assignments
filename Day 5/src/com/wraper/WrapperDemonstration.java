package com.wraper;
//import java.lang.Object;
import static java.lang.Integer.*;
public class WrapperDemonstration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int i=10;
		int j=20;
		Integer k=new Integer(i);
		Integer l=new Integer(j);
		System.out.println(k.doubleValue());
		System.out.println(k.compareTo(l));
		System.out.println(k.equals(l));
		System.out.println(k.hashCode());
		System.out.println(k.shortValue());
		System.out.println(k.floatValue());
		System.out.println(k.byteValue());
		System.out.println(getInteger("He"));
		System.out.println(bitCount(8));
		System.out.println(compare(8, 9));
		System.out.println(compareUnsigned(7, 11));
		System.out.println(divideUnsigned(12,2));
		System.out.println(highestOneBit(i));
		System.out.println(lowestOneBit(i));
		System.out.println(max(7,8));
		System.out.println(min(7,8));
		System.out.println(parseInt("123"));
		System.out.println(reverse(123));
		System.out.println(rotateLeft(123,1));
		System.out.println(toBinaryString(10));
		System.out.println(toOctalString(16));
		System.out.println(Integer.toString(i));
		System.out.println(valueOf("12369"));
		System.out.println(toUnsignedString(-10));
		System.out.println(signum(-123));
		
	}

}
