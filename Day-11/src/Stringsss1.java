import java.util.Arrays;

public class Stringsss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar[]={"apples","bat","cats","dinosaur","eagle"};
		FunctionInterface f1=(a)->{
			String[] a1=a;
			Arrays.sort(a1,(str1,str2)->str1.length()-str2.length());
			System.out.println(Arrays.asList(a1));
		};
		f1.strings(ar);
		FunctionInterface f2=(a)->{
			String[] a1=a;
			Arrays.sort(a1,(str1,str2)->str2.length()-str1.length());
			System.out.println(Arrays.asList(a1));
		};
		f2.strings(ar);
		FunctionInterface f3=(a)->{
			String[] a1=a;
			for(int i=0;i<a1.length;i++)
			{
				int c=a1[i].charAt(0);
				System.out.println(c);
			}
		};
		f3.strings(ar);
		FunctionInterface f4=(a)->{
			String[] a1=a;
			String[] b1 = new String[1];
			String[] c1 = new String[4];
			int j=0;
			for(int i=0;i<a1.length;i++)
			{
				char c=a1[i].charAt(0);
				if(c=='e')
				{
					b1[0]=a1[i];
				}
				else
				{
					c1[j]=a1[i];
					j++;
				}
			}
			System.out.println(b1[0]);
			for(String q:c1)
			{
				System.out.println(q);
			}
		};
		f4.strings(ar);
	}

}
