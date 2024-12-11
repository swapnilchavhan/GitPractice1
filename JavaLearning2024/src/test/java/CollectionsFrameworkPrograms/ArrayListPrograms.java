package CollectionsFrameworkPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1 = new ArrayList();
		
		al1.add(10); //test
		al1.add('a');
		al1.add("hello");
		al1.add(10);
		al1.add('a');
		System.out.println("Array List 1 :"+al1);
		
		al1.set(3, 11);
		System.out.println("Array List 2 :"+al1);
		
		al1.remove(3);
		System.out.println("Array List 3 :"+al1);

		al1.add(3, 'b');
		System.out.println("Array List 4 :"+al1);
		
		System.out.println("Array Contain hello : "+al1.contains("hello"));
		
		System.out.println("Array element at 0 is :"+al1.get(0));
		
		System.out.println("Index of 10 is: "+ al1.indexOf(10));
		
		System.out.println("Is Array Empty ? :"+al1.isEmpty());
		
		System.out.println("Size of Array is : "+al1.size());
		
		System.out.println("Array List 5 :"+al1.remove(2));
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(11);
		al2.add(22);
		al2.add(33);
		
		//Method 1: Using for loop
		System.out.print("Array List Using for loop :");
		for(int i=0;i<al2.size();i++)
		{
			System.out.print(al2.get(i)+", ");
		}
		System.out.println();
		
		//Method 2: Using While loop 
		System.out.print("Array List Using While loop :");
		int i=0;
		while(al2.size()>i)
		{
			System.out.print(al2.get(i)+", ");
			i++;
		}
		System.out.println();
		
		//Method 3: Using for each loop
		System.out.print("Array List Using for each loop :");
		for(int j:al2)
		{
			System.out.print(j+", ");
		}
		System.out.println();
		
		//Method 4: Using Iterator 
		System.out.print("Array List Using Iterator :");
		Iterator it = al2.iterator();
				while(it.hasNext())
		{
			System.out.print(it.next()+", ");
			i++;
		}
		System.out.println();
		
	}

}
