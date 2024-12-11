package ArrayPrograms;

public class SumOfMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// int[] arr = { 1, 6, 7, 2, 9, 8, 3, 4, 5 };

		int max1 = arr[0], max2 = arr[0], sum;

		// Find the first largest element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];

			}

		}
		// Find the second largest element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max2 && arr[i] != max1) {
				max2 = arr[i];

			}

		}

		sum = max1 + max2;
		System.out.println("Max Sum of the Number is " + max1 + " + " + max2 + " = " + sum);

	}

}
