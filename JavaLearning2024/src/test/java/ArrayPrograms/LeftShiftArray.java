package ArrayPrograms;

public class LeftShiftArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6};
		int leftShiftBy = 3;
		int j,firstNumber;
		
		System.out.print("Original Array is - ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<leftShiftBy;i++)
		{
			firstNumber= arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			arr[j]=firstNumber;
		}
	
		System.out.print("\n"+"After Left Shift Array is - ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
		
	}

}
