
public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int reversedInteger = 0, remainder, originalInteger;

		originalInteger = a;
		while (a != 0) {
			remainder = a % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			a /= 10;
		}
		//System.out.println(reversedInteger);
		boolean flag = false;
		for (int j = 2; j <=reversedInteger  / 2; ++j) {
			if (reversedInteger % j == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(reversedInteger + " is a prime number.");
		else
			System.out.println(reversedInteger + " is not a prime number.");
	}

}
