import java.util.Scanner;

public class ArraysQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of numbers");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 2; j <= a[i] / 2; ++j) {
				if (a[i] % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(a[i] + " is a prime number.");
			else
				System.out.println(a[i] + " is not a prime number.");

		}
		for (int i = 0; i < n; i++) {
			int reversedInteger = 0, remainder, originalInteger,p;

			originalInteger = a[i];
			p=a[i];
			while (p != 0) {
				remainder = p % 10;
				reversedInteger = reversedInteger * 10 + remainder;
				p /= 10;
			}

			if (originalInteger == reversedInteger)
				System.out.println(originalInteger + " is a palindrome.");
			else
				System.out.println(originalInteger + " is not a palindrome.");
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int p = a[i];
			int j = 1;
			while (j <= p / 2) {
				if (p % j == 0) {
					sum += j;
				}
				j++;
			}
			if (sum == p) {
				System.out.println(p + " is a perfect number");
			} else
				System.out.println(p + " is not a  perfect number");
		}
		for (int i = 0; i < n; i++) {
			int number, temp, total = 0;

			number = a[i];
			while (number != 0) {
				temp = number % 10;
				total = total + temp * temp * temp;
				number /= 10;
			}

			if (total == a[i])
				System.out.println(a[i] + " is an Armstrong number");
			else
				System.out.println(a[i] + " is not an Armstrong number");
		}
	}

}
