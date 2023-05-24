package day11.whileloopassignments;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int n=4567,rev=0,rem;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;					
		}
		System.out.println("Oroginal number = "+temp);
		System.out.println("Reveresed number = "+rev);
	}

}
