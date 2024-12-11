package StringPrograms;

import java.util.Scanner;

public class NumberOfWordsInString {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String - ");
		String str = scr.nextLine();
		
		String[] arr = str.split(" ");
		
		System.out.println("Total number of words in String :" + arr.length);

	}

}
