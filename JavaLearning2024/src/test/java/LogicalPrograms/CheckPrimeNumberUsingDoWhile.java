package LogicalPrograms;

import java.util.Scanner;

public class CheckPrimeNumberUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number you want to check for prime number ? ");
		Scanner scr = new Scanner(System.in);
		int num  = scr.nextInt();
		
		int i=1;
		boolean flag = true;
		
		
		
		if(num == 0||num==1)
		{
			System.out.println("Number is not prime Number");
		}
		else
		{
			do {
					if(num%i==0)
					{
						flag= false;
						break;
					}
				i++;
				
			}while(i<num/2);
			
			if(flag)
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
		}

	}

}
