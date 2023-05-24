package day36.collections2;
import java.util.*;
public class GenericArrayListExample3 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Advik");
		al.add("Dhrivin");
		al.add("Ira");
		al.add("Nirvan");
		al.add(null);
		//System.out.println(al);
		//using forEach
		//al.forEach(a-> {System.out.print(a+" "); });
		//using iterator()
//		Iterator it=al.iterator();
//		while(it.hasNext()) 
//		{
//			System.out.print(it.next()+" ");
//		}
		//using for
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		//remove() method
		System.out.println("Size of list : "+al.size());
		System.out.println("Removing first element : "+al.remove(4));
		System.out.println(al);
		ArrayList<String> a=new ArrayList<>();
		a.add("Pruthviraj");
		a.add("Swaraj");
		a.add("Rutuja");
		a.addAll(al);
		System.out.println("Second list : "+a);
		a.removeAll(al);
		System.out.println("Removing element :"+a);
		//removeIf new feature added in java8
		a.removeIf(str -> str.contains("pqy"));
		System.out.println("Elemnts after using removeIf...."+a);
		}

}
