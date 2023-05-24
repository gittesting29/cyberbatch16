package day11.whileloopassignments;

public class CountNumberOfDigits {

	public static void main(String[] args)
	{
		int count=0,num=100;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits = "+count);
	}
}
