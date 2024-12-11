package StringPrograms;

import java.util.Scanner;

public class FindDuplicateCharacterFromOneString {

	public static void main(String[] args) {

		System.out.println("Enter the String ");
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		System.out.println("Original String - " + str);

		char[] charArray = str.toCharArray();

		System.out.print("Dublicate Character in String are - ");
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {

				if (charArray[i] == charArray[j]) 
				{
					System.out.print(charArray[j] + " ");
					break;

				}
			}
		}

	}

}
