package day36.collections2;
import java.util.*;
public class PriorityQueueExample 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(345);
		q.add(123);
		q.add(7867);
		q.add(667);
		q.add(678);
		q.add(9089);
		q.add(7876);
		System.out.println("Queue Size : "+q.size());
		System.out.println("Queue elements : "+q);
		System.out.println("First element of queue : "+q.peek());
		//in case of null queue peek() returns null instead of throwing exception
		Queue<String> q1=new PriorityQueue<String>();
		System.out.println("Second queue size : "+q1.size());
		System.out.println("First element of empty queue  : "+q1.peek());
		
		//removing first element, use remove(), for empty will generate error
		System.out.println("removing firt element from 1st queue using remove : "+q.remove());
		System.out.println("Printing after removing element ...."+q);
		//Polling first element, use poll() , for empty queue will not generate error return null
		System.out.println("pooling firt element from empty queue using poll : "+q1.poll());
//		System.out.println("Printing after removing element ...."+q);
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n\nElements of empty Queue : "+q1);
		//iterating through queue using forEach
		q.forEach(a -> {System.out.print(a+" "); });

	}

}
