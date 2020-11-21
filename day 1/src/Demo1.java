import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int sum,percent;
		sum=a+b+c;
		percent=((a+b+c)*100)/300;
		System.out.println(percent);
		char grad=0;
		if(percent<100 && percent>=90)
		{
			grad='A';
		}
		else if(percent<=90 && percent>=80)
		{
			grad='B';
		}
		else if(percent<=80 && percent>=70)
		{
			grad='C';
		}
		else
		{
			grad='F';
		}
		System.out.println(grad);
		switch(grad)
		{
		case 'A':
			System.out.println("First grade");
			break;
		case 'B':
			System.out.println("Second grade");
			break;
		case 'C':
			System.out.println("Third grade");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		}
	}

}
