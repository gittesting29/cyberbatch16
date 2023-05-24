package day10.conditionalconstructs;

public class IfWithRelationalOp 
{

	public static void main(String[] args) 
	{
		int num1=60, num2=60;
		
		if(num1!=num2)
			System.out.println("not equal numbers");
		else
			System.out.println("both are equal numbers");
		System.out.println("*****************************************************");

		if(num1>num2)
			System.out.println("Number1 is greater than number2.");
		else
			System.out.println("both are equal numbers");
		System.out.println("*****************************************************");
		
		if(num1>=num2)
			System.out.println("Number1 is greater than or equals to number2.");
		else
			System.out.println("Number 1 is less than number 2.");
		System.out.println("*****************************************************");
		
		if(num1<=num2)
			System.out.println("Number1 is less than or equals to number2.");
		else
			System.out.println("Number 1 is greater than number 2.");
		System.out.println("*****************************************************");
		
		if((num1>=num2) || (num1>num2))
			System.out.println("Number1 is greater than or equals to number2.");
		else
			System.out.println("Number 1 is smaller than number 2.");
		System.out.println("*****************************************************");
		
		int sub1=50, sub2=30;
		if(sub1>35 && sub2>35)
			System.out.println("pass.......");
		else
			System.out.println("fail.......");
		
	}

}
