package PatternsPrintPrograms;

import java.util.*;

public class try1
{

	public static void main(String str[])
	{
			
		int [] arr1 = {14, 0, 5, 2, 0, 3, 0};
		int arr2 [] = {0,0,0,0,0,0,0};
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				arr2[i]=arr1[i];
			}
		}
		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[j]!=0)
			{
			 arr2[j]= arr1[j];
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]+" ");
		}
		
		
	}
}
