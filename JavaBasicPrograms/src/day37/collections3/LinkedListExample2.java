package day37.collections3;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListExample2
{
	public static void main(String[] args) 
	{
		LinkedList<String> l1=new LinkedList<String>();
		System.out.println("Intitial list elements : "+l1);
		l1.add("Ravi");
		l1.add("Vijay");
		l1.add("Ajay");
		System.out.println("List elements after adding : "+l1);
		
		ListIterator<String> itr1=l1.listIterator();
		System.out.println("Check if previous element is present or not: "+itr1.hasPrevious());
		System.out.println("Check if next element is present or not: "+itr1.hasNext());
		
		try {
		System.out.println("Print previous element : "+itr1.previous());
		}catch(Throwable e)
		{
			System.out.println("Please chk list has previous element."+e);
		}
		
		try{
			System.out.println("Print next element : "+itr1.next());
		}catch(Throwable e)
		{
			System.out.println(" Please check  "+e);
		}
	}

}
