package day11.forassigments;

public class PalindromNumber {

	public static void main(String[] args) 
	{
		int number=123321,sum=0, rem,temp=number;
		while(number!=0) 
		{
			rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;			
		}
		if(temp==sum)
			System.out.println(temp+" is palindrome number.");
		else
			System.out.println(temp+" is not palindrom number.");
	}
}
