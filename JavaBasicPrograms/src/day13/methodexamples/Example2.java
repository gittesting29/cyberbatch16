package day13.methodexamples;

public class Example2
{
	static void addNumber()
	{
		int num1=90, num2=30, res;
		res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		System.out.println("Result : "+res);
	}
	static int addNumber(int num1, int num2)
	{
		int	res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		return res;
	}

	public static void main(String[] args)
	{
		Example2.addNumber();// it will execute method body and for each run it will give same result but we c=wont be able to use its return value
		System.out.println("***********************1************************\n");
		
		addNumber(10,15);//executes method body but will not print result bcz not printed 
		System.out.println("***********************2************************\n");
		
		System.out.println("Result : "+addNumber(45,45));//executes method body also will  print result
		System.out.println("***********************3************************\n");
		
		int res=Example2.addNumber(10,15);///will execute method body and stores return value in the variable for future use.
		System.out.println("Result of two numbers : "+res);
		System.out.println("***********************4************************\n");
		 
		int updatedValue=res*10;
		System.out.println("Updated Value = "+updatedValue);
		System.out.println("***********************5************************\n");

		
		int finalResult=updatedValue*100;
		System.out.println(finalResult);

		


	}

}
