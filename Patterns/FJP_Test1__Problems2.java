package Problems;

import java.util.Scanner;

public class Problems2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {

		int x = 64;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i) {
					System.out.print((char) (x + i));
				} else {
					System.out.print("*");
				}

			}

			System.out.println();

		}
	}

}
