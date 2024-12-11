package LogicalPrograms;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {

		int number,reminder,reverseNumber = 0;
		
		System.out.println("Enter the number to be Reverse: ");
		
		Scanner input =new Scanner(System.in);
		number = input.nextInt();
		
		while(number>0) {
			
			reminder = number%10;
			reverseNumber = (reverseNumber*10)+reminder;
			number = number/10;
			
		}
		System.out.println("Reverse Number is :" + reverseNumber);

	}

}
