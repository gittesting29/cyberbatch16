package day11.forassigments;

public class CountNoOfDigits {

	public static void main(String[] args) 
	{
		int count=0, number=123456;
		for(;number>0; number/=10, ++count) 
		{
		}
		System.out.println("Number of digits = "+count);

	}

}
