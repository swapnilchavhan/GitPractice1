package ArrayPrograms;

public class PrintArrays {

	public static void main(String[] args) {
		char[] arr1 =  { 'a', 'b', 'c' };
		int[] arr2 =  { 1, 2, 3 };
		String[] arr3 =  { "Strin1", "Strin2", "Strin3" };
		

		System.out.println("Array#1- Character Array : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Array#2- Integer Array : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("Array#3- String Array : ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
