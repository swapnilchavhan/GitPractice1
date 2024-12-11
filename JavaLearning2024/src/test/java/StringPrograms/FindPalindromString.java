package StringPrograms;

public class FindPalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "swapnil abcba chavhan efgfe";
		String[] arr = str.split(" ");
		String revers = "";

		System.out.println("Palindrom String is - ");
		for (int i = 0; i < arr.length; i++) 
		{
			
			revers = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) 
			{
				revers = revers + arr[i].charAt(j);

			}
			if (revers.equals(arr[i]))
				System.out.println(arr[i]);

		}

	}

}
