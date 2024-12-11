package ArrayPrograms;

import java.util.HashSet;

public class RemoveCharacterFromArrayUsingHashSet
			{
				public static void main(String [] args)
				{
						char [] arr1 = {'a','e','b','c','d','e'};
						char ch = 'e';

						HashSet<Character> hSet = new HashSet<Character>();
						
						for(char c: arr1)
						{
							if(c!=ch)
								hSet.add(c);
						}
						System.out.println(hSet);
				}
			
		
		
		}



