package LogicalPrograms;
import java.util.Scanner;

public class FibonacciSeries {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3,count;
		
		System.out.print("Enter the leanght of Fibonacci Series: ");
		Scanner input = new Scanner(System.in);
		count = input.nextInt();
		
		System.out.print("Fibonacci Series: "+n1+" "+n2);
	
		for(int i=0;i<count-2;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}	
		

	}

}
