package PatternsPrintPrograms;

import java.util.Scanner;

public class PrintPyramidTriangle {

	public static void main(String[] args) {

		System.out.println("Enter Number of row's: ");
		Scanner scr= new Scanner(System.in);
		int number  = scr.nextInt();

		System.out.println("Trangle Pyramid: ");

		for (int i = 0; i < number; i++)// outer loop for number of rows
		{
			for (int j = 0; j < number - i; j++) // inner loop for number of spaces
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) // inner loop for * printing
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
