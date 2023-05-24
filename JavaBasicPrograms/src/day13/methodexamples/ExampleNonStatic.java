package day13.methodexamples;

public class ExampleNonStatic 
{
	public void display()
	{
		System.out.println("hello...Java....");
		System.out.println("This is method example");
	}
	void showDetails(String name, char grade, int num)
	{
		System.out.println("Hello, I am "+name);
		System.out.println("My garde is "+grade);
		System.out.println("My contact number is "+num);
	}
	void addNumber()
	{
		int num1=90, num2=30, res;
		res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		System.out.println("Result : "+res);
	}
	void addNumber1(int num1, int num2)
	{
		int	res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		System.out.println("Result : "+res);
	}
	public static void main(String[] args) 
	{
		ExampleNonStatic obj1=new ExampleNonStatic();
		obj1.display();
		System.out.println("***********************1************************\n");

		obj1.showDetails("ABC",'A',456213);
		System.out.println("***********************1************************\n");

		obj1.addNumber();
		System.out.println("***********************1************************\n");

		obj1.addNumber1(25,30);
		System.out.println("***********************1************************\n");

	}

}
