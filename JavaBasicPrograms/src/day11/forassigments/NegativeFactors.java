package day11.forassigments;

public class NegativeFactors {

	public static void main(String[] args) 
	{
		int number=-60;
		System.out.println("Factors of "+number+" are: ");
		//run loop -60 to 60
		for(int i= number;i<=Math.abs(number);i++)
		{
			//skip the iteration for i=0
			if(i==0)
			{
				continue;
			}
			else
			{
				if(number % i== 0)
				{
					System.out.print(i+" ");
				}
			}
		}

	}

}
