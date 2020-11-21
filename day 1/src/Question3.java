import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c,d;
		reverse r=new reverse();
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int l1,l2,l3;
		l1=a%10;
		l2=b%10;
		l3=c%10;
		if(l1%2==0 && l2%2==0 && l3%2==0)
		{
			System.out.println((a+b+c));
		}
		else
		{
			if(l1%2!=0)
			{
				d=r.reve(a);
				System.out.println((d+b+c));
			}
			else if(l2%2!=0)
			{
				d=r.reve(b);
				System.out.println((a+d+c));
			}
			else if(l3%2!=0)
			{
				d=r.reve(c);
				System.out.println((a+b+d));
			}
			
		}
	}

}
class reverse
{
	public int reve(int z)
	{
		int rev = 0,rem;
		while(z!=0)
		{
			rem=z%10;
			rev=rev*10+rem;
			z=z/10;
		}
		return z;
	}
}