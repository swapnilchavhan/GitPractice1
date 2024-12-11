package StringPrograms;

import java.util.*;

public class FindDuplicateWordsInString {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String - ");
		String str1 = scr.nextLine();
		str1 = str1.toLowerCase();
		String[] StringArr = str1.split(" ");
		
	
		System.out.println("Duplicate Words in String ");

		for (int i = 0; i < StringArr.length; i++) {
			
			for (int j = i + 1; j < StringArr.length; j++) {
				
				if (StringArr[i].equals(StringArr[j]))
				{					
					System.out.println(StringArr[i]);
					break;
				}
			}

		}

	}
}
