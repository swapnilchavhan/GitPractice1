package StringPrograms;

public class NumOfCharactersInString {

	public static void main(String[] args) {

		int count = 0;

		String str = "The best of both the worlds";
		System.out.println("The String is :" + str);

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ')
				count++;
		}

		System.out.println("Number of Char " + count);

	}

}
