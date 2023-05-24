package day19.contsructors;

/* constructor overloading: when we declare more than one constructor in a class then it is constructor overloading
 * Rule to overload :		
 * 		1. types of argument differ
 * 		2. number of argument differ
 * 		3. position of argument differ*/


public class Example2_Overloading 
{
	int age;
	Example2_Overloading()
	{
		System.out.println("This is zero parameterised constructor..");
		
		System.out.println("vlaue="+age);
	}

	Example2_Overloading(char c)
	{
		System.out.println("This is single parameter constructor..");
		System.out.println("vlaue="+c);
	}
	Example2_Overloading(int num1, int num2)
	{
		System.out.println("This is int int parameterised constructor..");
		System.out.println("vlaue1="+num1+"    vlaue2="+num2);
	}

	Example2_Overloading(int num1, double num2)
	{
		System.out.println("This is int- double parameterized constructor..");
		System.out.println("vlaue1="+num1+"    vlaue2="+num2);
	}
	
	public static void main(String[] args) 
	{
		Example2_Overloading obj1= new Example2_Overloading();
		Example2_Overloading obj2= new Example2_Overloading('a');
		Example2_Overloading obj3= new Example2_Overloading(100,200);
		Example2_Overloading obj4= new Example2_Overloading(100, 23.67);
	}

}
