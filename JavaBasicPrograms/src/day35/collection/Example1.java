package day35.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List l2=new ArrayList();
		l2.add("Pune");//String class object will be upcasted to Object class object.
		l2.add(411015);//Autoboxing(int to Integer class object) dn auto upcasting(Integer class to Object class)
		l2.add("Pune");//duplicate elements are allowed
		l2.add(null);//null values are also allowed
		l2.add("Mumbai");
		//get element from collection based on index
		System.out.println("Element at 0 index: "+l2.get(0));
		System.out.println("Element at 1 index: "+l2.get(1));
		System.out.println("Element at 2 index: "+l2.get(2));
		System.out.println("Elemeny at 3 index: "+l2.get(3));
		//get the total stored element count from collection
		System.out.println("Element count is: "+l2.size());
		//to get all element of collection print collection object
		System.out.println("List Elements are: "+l2);
		//add element in collection based on index
		l2.add(1, "Java");
		l2.add(6, "pqr");
		System.out.println("update, Element count is: "+l2.size());
		System.out.println("Update, List Elements are: "+l2);
		//print one by one all the collection elements
		for(int i=0;i<l2.size();i++) {
			System.out.println("Element at index "+i+": "+l2.get(i));
		}
		System.out.println("*********Print using for-each loop************");
		//we can also iterate collection using for each loop
		for(Object obj:l2) {
			System.out.println(obj);
		}
		System.out.println("******Print using Iterator********");
		//we can also iterate collection using Iterator interface
		Iterator it=l2.iterator();
		/**
		 * Iterator interface is used to iterate collection elements using following methods
		 * hasNext()--> boolean -->true/false
		 * next()   --> Object  -->
		 * remove() -->
		 */
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());// you will get NoSuchElementException
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******Print using used Iteraror object********");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator it2=l2.iterator();
		System.out.println("******Print using new Iteraror object********");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("List1 elements: "+l2);
		
		List l3=new ArrayList();
		l3.add("Apple");
		l3.add("Grapes");
		l3.add("Banana");
		l3.add("Mango");
		System.out.println("List12 elements: "+l3);
		//adding l3 elements into l2 collection
		l2.addAll(l3);
		System.out.println("Elements of l2 after adding l3: "+l2);
		//adding l2 elements in l3 collection from index 2
		l3.addAll(2, l2);
		System.out.println("Elements of l3 after adding l2: "+l3);
	}

}
