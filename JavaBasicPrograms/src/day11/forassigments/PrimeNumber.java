package day11.forassigments;

public class PrimeNumber
{

	public static void main(String[] args) 
	{
		int num=13,flag=0;
		if(num==0 || num==1)
			System.out.println(num+" is prime number.");
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
				System.out.println(num+" is prime number.");
		}
	}
}