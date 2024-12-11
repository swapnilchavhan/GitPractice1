package StringPrograms;
import java.util.*;

public class FindMaximumOccuringCharInSting {

	public static void main(String[] args) {

		System.out.println("Enter the String you want to check : ");
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();

		char ans = 0,alphabet = 0;
		int count = 0;

		// create HashMap to store frequency of every character
		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			// push element into map and increase its frequency
			alphabet = str.charAt(i);
			hashMap.put(str.charAt(i), hashMap.getOrDefault(alphabet, 0) + 1);
			
			// update answer and count
			if (count < hashMap.get(alphabet)) {
				ans = alphabet;
				count = hashMap.get(alphabet);
			}
		}
		System.out.println("Max occurring character is : '" + ans +"' and it's count is - "+ count);
	}
}
