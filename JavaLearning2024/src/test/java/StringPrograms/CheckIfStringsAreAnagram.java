package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfStringsAreAnagram {

	public static void main(String[] args) {

		System.out.println("Java Program to check if the two strings are Anagram:");
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter String#1");
		String str1 = scr.next();
		
		System.out.println("Enter String#2");
		String str2 = scr.next();

		if (str1.length() != str2.length()) {
			System.out.println("Both the Strings are Not Anagram");
		} else {

			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)==true)
				System.out.println("String is Anagram");
			else
				System.out.println("String is not Anagram");
						
			
		}

	}

}
