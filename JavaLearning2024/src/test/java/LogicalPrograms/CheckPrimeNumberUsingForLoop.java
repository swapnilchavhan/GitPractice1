package LogicalPrograms;
import java.util.Scanner;

public class CheckPrimeNumberUsingForLoop{
	
	public static void main(String[] args)
	{
		int number,mid,flag=0;
		
		System.out.println("Enter the number to check: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		mid=number/2;
		
		if(number==0||number==1)
		{
			System.out.println("Number is not Prime Number");
		}
		else 
		{
			for(int i=2;i<=mid;i++)
			{
				if(number%i==0) {
					System.out.println("Number is not Prime Number");
				    flag=1;
				    break;
				}
					
			}
			if(flag==0)
				System.out.println("Number is Prime Number");
		}
	}
	

	

}
