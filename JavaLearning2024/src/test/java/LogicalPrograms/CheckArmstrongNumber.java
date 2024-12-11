package LogicalPrograms;

import java.util.*;

public class CheckArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number to be checked as Armstrong : ");
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();

		int reminder, sum = 0;
		int temp = number;

		while (number > 0) {

			reminder = number % 10;
			sum = sum + (reminder * reminder * reminder);
			number = number / 10;

		}
		if (temp == sum)
			System.out.println("Number " + temp + " is Armstrong Number");
		else
			System.out.println("Number " + temp + " is Not Armstrong Number");
	}

}
