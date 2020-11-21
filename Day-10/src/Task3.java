import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=10;i<20;i++)
		{
			al.add(i);
			if(i==15)
			{
				for(int j=101;j<107;j++)
				{
					al.add(j);
				}
			}
		}
		int a=al.size();
		System.out.println(al);
		System.out.println(a);
		Integer arr[]=new Integer[a];
		int j=0;
		for(Integer i:al)
		{
			System.out.println(i);
			arr[j]=i;
			j++;
		}
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.binarySearch(arr, 14));
		Integer[] q=Arrays.copyOfRange(arr, 4, 9);
		System.out.println("copy of range method");
		for(Integer co:q)
		{
			System.out.println(co);
		}
		System.out.println(Arrays.equals(arr, q));
		System.out.println(Arrays.deepHashCode(arr));
		System.out.println(Arrays.hashCode(arr));
		Arrays.parallelSort(arr);
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.spliterator(arr));
		
	}

}
