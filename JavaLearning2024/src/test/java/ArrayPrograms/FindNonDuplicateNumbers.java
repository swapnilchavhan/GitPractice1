package ArrayPrograms;

public class FindNonDuplicateNumbers {

	public static void main(String[] args) {
		boolean nonduplicate;

		int[] arr1 = {1,2,3,4,1,5,6,2,7,8,3,1};

		for (int i = 0; i < arr1.length; i++) {
			nonduplicate = true;

			for (int j = 0; j < arr1.length; j++) {
				if ((arr1[i] == arr1[j]) && (i != j))
					nonduplicate = false;
			}
			if (nonduplicate) {
				System.out.print(" " + arr1[i]);
			}
		}

	}

}
