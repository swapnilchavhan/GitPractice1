package PatternsPrintPrograms;

import java.util.*;

public class PrintDimond {

	public static void main(String[] args) {
		
		System.out.println("Enter number of rows - ");
		Scanner scr  = new Scanner(System.in);
		int numberOfRows = scr.nextInt();
		
		for(int i=1;i<=numberOfRows;i++)
		{
			for(int j=1;j<=(numberOfRows-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=numberOfRows;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(numberOfRows-i);j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
