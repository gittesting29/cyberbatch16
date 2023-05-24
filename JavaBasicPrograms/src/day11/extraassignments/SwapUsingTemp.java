package day11.extraassignments;

public class SwapUsingTemp {

	public static void main(String[] args) 
	{
		int a=10,b=45,temp;
		System.out.println("Before swapping " + a + " and "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Afeter swapping " + a + " and "+b);
	}

}
