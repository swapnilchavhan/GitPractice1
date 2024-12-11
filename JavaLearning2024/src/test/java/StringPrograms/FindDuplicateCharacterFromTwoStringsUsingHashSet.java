package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacterFromTwoStringsUsingHashSet {

	public static void main(String[] args) {

		String str1 = "Hellow";
		String str2 = "Happy Sweet";

		System.out.println("String1 is - " + str1);
		System.out.println("String2 is - " + str2);

		HashSet<Character> uniqueChar = new HashSet<>();
		HashSet<Character> duplicateChar = new HashSet<>();

		for (char c : str1.toCharArray()) {
			uniqueChar.add(c);
		}

		for (char c : str2.toCharArray()) {
			if (uniqueChar.contains(c))
				duplicateChar.add(c);
		}

		System.out.println("Duplicate Elements are - " + duplicateChar);

	}

}
