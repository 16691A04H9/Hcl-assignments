import java.util.Scanner;

public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, i;
		System.out.println("Enter a number");
		a = s.nextInt();
		do {
			System.out.println("1.prime number");
			System.out.println("2.perfect number");
			System.out.println("3.armstrong number");
			System.out.println("4.palindrome");
			System.out.println("5.exit");
			i = s.nextInt();

			switch (i) {
			case 1:
				boolean flag = false;
				for (int j = 2; j <= a / 2; ++j) {
					if (a % j == 0) {
						flag = true;
						break;
					}
				}

				if (!flag)
					System.out.println(a + " is a prime number.");
				else
					System.out.println(a + " is not a prime number.");
				break;
			case 2:
				int j, Sum = 0;
				for (j = 1; j < a; j++) {
					if (a % j == 0) {
						Sum = Sum + i;
					}
				}
				if (Sum == a) {
					System.out.format("\n% d is a Perfect Number", a);
				} else {
					System.out.format("\n% d is NOT a Perfect Number", a);
				}
				break;
			case 3:
				int number, temp, total = 0;

				number = a;
				while (number != 0) {
					temp = number % 10;
					total = total + temp * temp * temp;
					number /= 10;
				}

				if (total == a)
					System.out.println(a + " is an Armstrong number");
				else
					System.out.println(a + " is not an Armstrong number");
				break;
			case 4:
				int reversedInteger = 0, remainder, originalInteger;

				originalInteger = a;
				while (a != 0) {
					remainder = a % 10;
					reversedInteger = reversedInteger * 10 + remainder;
					a /= 10;
				}

				if (originalInteger == reversedInteger)
					System.out.println(originalInteger + " is a palindrome.");
				else
					System.out.println(originalInteger + " is not a palindrome.");
				break;
			case 5:
				System.out.println("Thank you");
			}
		} while (i != 5);
	}
}