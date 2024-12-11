package LogicalPrograms;

public class ArrangeTheNumberInDescendingOrderWithSecondDigit2 {

	public static void main(String[] args) {

		int[] arr1 = { 23, 76, 85, 31, 29, 38, 18, 96 };
		int temp = 0;

		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = i + 1; j < arr1.length; j++) {
				
				temp = arr1[i];
				if (arr1[i] % 10 < arr1[j] % 10) {

					arr1[i] = arr1[j];
					arr1[j] = temp;

				} else {
					if (arr1[i] % 10 == arr1[j] % 10) {
						if (arr1[i] > arr1[j]) {
							arr1[i] = arr1[j];
							arr1[j] = temp;
						}
					}
				}

			}

		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
