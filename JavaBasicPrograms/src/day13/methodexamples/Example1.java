package day13.methodexamples;

public class Example1 {
	public static void display()
	{
		System.out.println("hello...Java....");
		System.out.println("This is method example");
	}
	static void showDetails(String name, char grade, int num)
	{
		System.out.println("Hello, I am "+name);
		System.out.println("My garde is "+grade);
		System.out.println("My contact number is "+num);
	}
	static void addNumber()
	{
		int num1=90, num2=30, res;
		res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		System.out.println("Result : "+res);
	}
	static void addNumber1(int num1, int num2)
	{
		int	res=num1+num2;
		System.out.println("Number 1 :"+num1);
		System.out.println("Number 2 "+num2);
		System.out.println("Result : "+res);
	}
	public static void main(String[] args)
	{
		display();//we can run this method multiple times, but you will get same result for each run.
		//System.out.println(display()); ------> this statement will raise error as this method wont retuen any value.
		showDetails("Advik",'A',7896533);
		System.out.println("*************************************\n");
		showDetails("Era",'A',7855112);
		System.out.println("*************************************\n");
		showDetails("Druvin",'B',7856662);
		System.out.println("*************************************\n");
		addNumber();
		System.out.println("*************************************\n");
		Example1.addNumber();
		System.out.println("*************************************\n");
		addNumber1(23,30);
		System.out.println("*************************************\n");

	}

}
