package ArrayPrograms;

public class RemoveCharacterFromArray
			{
				public static void main(String [] args)
				{
						char [] arr1 = {'a','b','c','d','e'};
						char ch = 'e';
						int length = arr1.length;
						char [] arr2 = new char[length];
						
						for(int i=0;i<arr1.length;i++)
						{
							if(arr1[i]!=ch)
							arr2[i] = arr1[i];			
							
						}
						for(int i=0;i<arr2.length;i++)
						{
							System.out.println(arr2[i]);
						}
				}
			
		
		
		}



