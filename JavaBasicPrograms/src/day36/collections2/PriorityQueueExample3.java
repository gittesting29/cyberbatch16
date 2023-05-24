package day36.collections2;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample3 
{
	public static void main(String[] args) 
	{
		Queue que=new PriorityQueue();
		System.out.println("Size : "+que.size());
		System.out.println("****************************************");
		System.out.println(que.poll());
		System.out.println("****************************************");
		que.add(150);
		que.add(10);
		que.add(6);
		que.add(5);
		que.add(10);
		System.out.println("After adding elements Size : "+que.size());
		
		System.out.println("*****************poll()***********************");
		System.out.println(que.poll());
		System.out.println("After polling queue : "+que);
		
		System.out.println("****************remove()***********************");
		System.out.println(que.remove());
		System.out.println("After removing queue : "+que);
		
		System.out.println("****************removeIf()***********************");
		System.out.println("After removing queue : "+que);	
	}
}
