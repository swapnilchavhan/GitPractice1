package StringPrograms;

import java.util.Scanner;

public class ReverseStringWithoutStringFuncation {

	public static void main(String[] args) {
		
		System.out.println("Enter the String - ");
		Scanner scr = new Scanner(System.in);
		String str1 = scr.next();
		System.out.println("Orignal String - "+str1);
		
		String reversString = "";
		
		for (int i = str1.length()-1; i >= 0; i--) {
			
			reversString = reversString + str1.charAt(i);
		}
		System.out.println("Reverse String - "+reversString);

	}

}
