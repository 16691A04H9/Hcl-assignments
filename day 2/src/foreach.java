import java.util.*;
public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[3];
		for(int i:a)
		{
			a[i]=s.nextInt();
		}
		for(int j:a)
		{
			System.out.println(j);
		}
	}

}
