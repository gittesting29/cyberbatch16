package day35.collection;
import java.util.*;
public class ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add("Banana");
		list.add("123");
		System.out.println("Arraylist Size : "+list.size());
	//	System.out.println("Elements of list : "+list);  //list is object we can directly print using object ceated
		for(Object obj : list)
		{
			System.out.print(obj+" ");
		}
		//we can change value at any index using "set()"
		list.set(0, "Apple");
		System.out.println("Arraylist Size : "+list.size());
		System.out.println("Elements of list : "+list);
		//we can sort list in ascending order using "sort()"
		list.add("012");
		list.add("Pine apple");
		System.out.println("Unsorted list : "+list);
		Collections.sort(list); //sort method is of Collections class
		System.out.println("Sorted list : "+list);
//		// forEach() method is new feature introduced in Java 8
//		System.out.println("Traversing through forEach().....");
//		list.forEach(a -> {System.out.print(a+" ");});
		ArrayList list2=new ArrayList();
		list2.add("a");
		list2.add("123");
		list2.add("lmn");
		list2.add("abc");
		list2.add("123");
		
		System.out.println("\n Second list size : "+list2.size());
		System.out.println("List elements using forEach : ");
		//list2.forEach(a -> {System.out.print(a+" ");});
		Collections.sort(list2);
//		//list2.forEach(a ->{System.out.println(a+" ");} );
////		System.out.println("Printing using iterator(.....)");
////		Iterator it=list2.iterator();
////		while(it.hasNext())
////		{
////			System.out.print(it.next()+" ");
////		}
//		Collections.sort(list2);
//		list2.forEach(a ->{System.out.print(a+" ");} );
		System.out.println("\n\nSorted list2 : "+list2);
		}
}