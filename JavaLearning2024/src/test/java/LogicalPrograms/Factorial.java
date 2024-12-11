package LogicalPrograms;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		int number, factorialNumber = 1;

		System.out.println("Enter the numebr for which you want to find the Factorial: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			
			factorialNumber = factorialNumber * i;

		}
		System.out.println("Factorial of " + number + " is :" + factorialNumber);

	}

}
