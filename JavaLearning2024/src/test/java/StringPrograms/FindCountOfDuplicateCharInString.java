package StringPrograms;

public class FindCountOfDuplicateCharInString {

	public static void main(String[] args) {

		String str = "abcdaefghijb";
		char[] arr = str.toCharArray();
		int count;

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';

				}

			}
			if (arr[i] != '0')
				System.out.println("Count of duplicate character for character " + arr[i] + " is - " + count);
		}

	}

}
