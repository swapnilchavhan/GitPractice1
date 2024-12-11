package StringPrograms;

public class FindCountOfTotalDuplicateCharacterFromOneString {

		public static void main(String[] args)
		{
			String str = "swapnilchavahan";
			char[] charArray = str.toCharArray();
			int count,duplicateCount=0;
			
			for(int i=0;i<str.length();i++)
			{
				count=0;
				for(int j=i+1;j<str.length();j++)
				{
					if(charArray[i]==charArray[j] && charArray[i]!=' ')
					{
						count++;
						charArray[j] ='0';
					}
				}
				if(count>0 && charArray[i]!='0')
				duplicateCount++;
			}
			System.out.println("Count of Total Duplicate Character is "+duplicateCount);
		
		}
	}
