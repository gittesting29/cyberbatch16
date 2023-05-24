package day35.collection;
import java.util.*;


/**
 * Iterator:
 it is a Interface in collection, which is used to iterate collection elements
 it has 3 methods to iterate through collection
  1. hasNext() : returns boolean : true if has next element or else returns false
  2. next() : returns object : returns next element
  3. remove() : void : deletes elements
 iterator object can be used to iterate a collection only once, for 2nd iteration
 we have to create new Iterator object.
 */
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(123);
		a1.add("Advik");
		a1.add(45);
		a1.add(null);
		System.out.println("Size of ArrayList : "+a1.size());
		System.out.println(a1);
		System.out.println("Priniting using for loop....\n");
		for(int i=0;i<a1.size();i++)
		{
			System.out.print(a1.get(i)+" ");
		}
		System.out.println("Priniting using foreach loop....\n");
		for(Object o:a1)
		{
			System.out.print(o+" ");
		}
		System.out.println("Priniting using iterator 1st time...");
		Iterator r1=a1.iterator();
		System.out.print("\nArray List : "+"[ ");
		while(r1.hasNext())
		{
			System.out.print(r1.next()+" ");
		}
		System.out.println("]");
		
		System.out.println("Prininting using iterator second by by creating new iterator object");
		Iterator r2=a1.iterator();
		while(r2.hasNext())
		{System.out.print(r2.next()+" ");}
		
		a1.set(0,"savita");
		for(Object o:a1)
		{
			System.out.print(o+" ");
		}
	}

}
