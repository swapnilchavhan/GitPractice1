package ArrayPrograms;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,7,8,8,3,2,1};
		
		System.out.println("Duplicate Numbers are - ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!='0')
				{
					System.out.println(arr[i]);
					arr[j]='0';
					break;
				}
			}
		}

	}

}
