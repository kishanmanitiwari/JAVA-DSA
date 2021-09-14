package Problems;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		// part 1 - the upper part
		int decreasing_limit = n + 1, cons = n;
		for (int i = 1; i <= n; i++) {
			int x = 0;

			for (int j = n; j >= decreasing_limit; j--) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print(j + " ");
				x++;
			}

			for (int j = 1; j <= (2 * n - 1 - 2 * x); j++) {
				if (cons % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print(cons + " ");
			}

			for (int j = decreasing_limit; j <= n; j++) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print(j + " ");
			}

			decreasing_limit--;
			cons--;
			System.out.println();

		}

		// part 2 - the lower part
		decreasing_limit = 3;
		cons = 2;
		for (int i = 1; i <= (n - 1); i++) {
			int x = 0;

			for (int j = n; j >= decreasing_limit; j--) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print(j + " ");
				x++;
			}

			for (int j = 1; j <= (2 * n - 1 - 2 * x); j++) {
				if (cons % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print(cons + " ");
			}

			for (int j = decreasing_limit; j <= n; j++) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else
					System.out.print(j + " ");
			}

			decreasing_limit++;
			cons++;
			System.out.println();

		}
	}

}
