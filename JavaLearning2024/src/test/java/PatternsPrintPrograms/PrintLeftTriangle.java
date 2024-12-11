package PatternsPrintPrograms;

import java.util.Scanner;

public class PrintLeftTriangle {

	public static void main(String[] args) {

		System.out.println("Enter Number of row's: ");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();

		System.out.println("Lift Triangle ");

		for (int i = 0; i < number; i++) {

			for (int j = 0; j < 2 * (number - i); j++) {

				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
