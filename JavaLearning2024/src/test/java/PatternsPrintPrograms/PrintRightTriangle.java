package PatternsPrintPrograms;

import java.util.Scanner;

public class PrintRightTriangle {

	public static void main(String[] args) {

		System.out.println("Enter Number of row's: ");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();

		System.out.println("Right Triangle: ");

		for (int i = 0; i < number; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
