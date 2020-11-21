import java.util.*;

public class ArraysQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows of first matrix");
		int r1, c1, r2, c2;
		r1 = s.nextInt();
		System.out.println("enter no of columns of first matrix");
		c1 = s.nextInt();
		System.out.println("enter no of rows of second matrix");
		r2 = s.nextInt();
		System.out.println("enter no of columns of second matrix");
		c2 = s.nextInt();
		if (r1 != c1 && r2 != c2) {
			System.out.println("rows and columns size must be equal");
		} else {
			System.out.println("Enter first matrix");
			int[][] a = new int[r1][c1];
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					a[i][j] = s.nextInt();
				}
			}
			System.out.println("Enter second matrix");
			int[][] b = new int[r2][c2];
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					b[i][j] = s.nextInt();
				}
			}
			int sum[][] = new int[r1][c1];
			System.out.println("Addition of matrices result");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					sum[i][j] = a[i][j] + b[i][j]; // use - for subtraction
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();// new line
			}
			int diff[][] = new int[r1][c1];
			System.out.println("subtraction of matrices result");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					diff[i][j] = a[i][j] - b[i][j];
					System.out.print(diff[i][j] + " ");
				}
				System.out.println();// new line
			}
			if (r2 == c1) {
				System.out.println("Multiplication is possible");
				int prod[][] = new int[r1][c2];
				for (int i = 0; i < r1; i++) {
					for (int j = 0; j < c2; j++) {
						prod[i][j] = 0;
						for (int k = 0; k < r1; k++) {
							prod[i][j] += a[i][k] * b[k][j];
						} // end of k loop
						System.out.print(prod[i][j] + " "); // printing matrix element
					} // end of j loop
					System.out.println();// new line
				}
			} else {
				System.out.println("Multiplication is not possible");
			}
		}

	}

}
