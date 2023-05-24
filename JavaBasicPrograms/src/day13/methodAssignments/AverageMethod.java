package day13.methodAssignments;

public class AverageMethod 
{
	static int x=10,y=20,z=30;
	public static double average(double p, double q, double r)
	{
		return (p+q+r)/3;
	}
	public static void main(String[] args) 
	{
		System.out.println("Average : "+average(x,y,z)); //using non static global variables
		System.out.println("Average : "+average(10,20,30)); //passing values to method
		 
		int a=10,b=20,c=30;
		double avg=average(a,b,c);
		System.out.println("Average : "+avg);
		avg=avg+1000;
		System.out.println("Final value of avg : "+avg);
	}

}
