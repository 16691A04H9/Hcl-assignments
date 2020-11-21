import java.io.*;
import java.util.Scanner;
public abstract class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<20;i++)
		{
			if((a*i)%3!=0)
			System.out.println(a+"X"+i+"="+(a*i));
		}
				
	}

}
