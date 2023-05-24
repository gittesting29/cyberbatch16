package day10.conditionalconstructs;

public class BloodDonate 
{
	public static void main(String[] args)
	{
		int age=12, weight=60;
		if(age>=18)
		{
			System.out.println("Candidate age = "+age);
			if(weight>50)
				System.out.println("You are eligible to donate blood..");
			else
				System.out.println("You are not eligible to donate blood as your weight is less.");
		}
		else
			System.out.println("Age must be greater than 18.");
		
	}

}
