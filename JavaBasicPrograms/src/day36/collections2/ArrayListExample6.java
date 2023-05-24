package day36.collections2;
import java.util.*;
public class ArrayListExample6 {

	public static void main(String[] args) {
//		with the help of generic we can force collection to store similar types of elements
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(67);
		list.add(10);
		list.add(78);
		list.add(0);
		list.add(89);
		System.out.println("List size : "+list.size());
		list.forEach(a -> {System.out.print(a+" ");});
		System.out.println("\n***************************");
		Collections.sort(list);
		System.out.println("\nSorted list : "+list);
		
		System.out.println("\n***************************");
		Collections.reverse(list);
		System.out.println("\nReverse list : "+list);
	}

}
