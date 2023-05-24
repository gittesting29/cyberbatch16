package day11.whileloopassignments;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int number=1,i=2,count=0;
		while(i<=number/2)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println(number+" is prime number..");
		}
		else
			System.out.println(number+" is not prime number.");
	}

}
