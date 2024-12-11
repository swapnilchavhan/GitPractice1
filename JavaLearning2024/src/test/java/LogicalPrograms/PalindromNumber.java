package LogicalPrograms;
import java.util.Scanner;

public class PalindromNumber {
	
	public static void main(String[] args)
	{
		int reminder,reverseNumber = 0,temp,number;
		
		System.out.println("Enter the number to check for Palindrom: ");
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		temp =number;
		
		while(number>0)
		{
			reminder = number%10;
			reverseNumber = (reverseNumber*10)+reminder;
			number = number/10;
		}
		if(temp == reverseNumber) {
			System.out.println("Number is palindrom");
		}
		else {
			System.out.println("Number is not Palindrom");
		
			
		}
			
		
	}
	
}
