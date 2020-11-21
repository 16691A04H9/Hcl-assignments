import java.io.*;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println("arithmetic operators");
		System.out.println("addition "+(a+b)+" performed addition between a and b");
		System.out.println("subtraction "+(a-b)+" performed subtraction between a and b");
		System.out.println("multiplication "+(a*b)+" performed multiplication between a and c");
		System.out.println("division "+(a/b)+" performed division between a and b and printed quotient");
		System.out.println("modulo "+(a%b)+" performed division between a and b and printed remainder");
		System.out.println("logical operators");
		
		System.out.println("logical and "+((a<b) && (a<c))+" checked condition that whether (a<b) and (a<c) ");
		System.out.println("LOGICAL OR " + ((a>b) || (a>c))+" checked condition that whether (a>b) and (a<c) ");
		System.out.println("bitwise operators");
		System.out.println("bitwise and "+(a&b)+" performed bitwise AND comparision between a and b");
		System.out.println("bitwise or "+(a|b)+" performed bitwise OR comparison between a and b");
		System.out.println("bitwise xor "+(a^b)+" performed bitwise XOR comparison between a and b");
		System.out.println("unary operators");
		System.out.println("postfix "+(a++)+" POST INCREMENT OF A");
		System.out.println("prefix "+(++a)+" PRE INCREMENT OF A");
		System.out.println("left shit and right shift");
		System.out.println("left shift "+(b<<2)+" Actually the number gets multiply by 2");
		System.out.println("right shift "+(b>>2)+" Actually the number gets divided by 2");
		System.out.println("ternary operator");
		int d;
		d=(c<b)?c:b;
		System.out.println("ternary "+d+" Similar to if else statement");
		System.out.println("assignment operators");
		c+=4;
		System.out.println("assignment "+c+" performs c=c+4");
	}

}
