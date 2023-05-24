package day10.conditionalconstructs;

public class BloodDonateWithBG 
{
	public static void main(String[] args)
	{
		int age=12, weight=60;
		char grp='A';
		if(age>=18)
		{
			if(weight>50)
			{
				if(grp=='A')
					System.out.println("You are eligible to donate blood..");
				else
					System.out.println("You are not eligible to donate blood as your blood group is not matching.");
		    }
			else
				System.out.println("You are not eligible to donate blood as your weight is below 50.");
		}
		else
			System.out.println("Age must be greater than 18.");
	}

}
