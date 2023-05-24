package day13.methodexamples;

public class ExampleStatic {
	static void display()
	{
		System.out.println("I am static display method.");
	}
	static void print(char c)
	{
		System.out.println("I am print method and printing char as :"+c);
	}
	static void call(int num)
	{
		System.out.println("I am call method and calling number : "+num);
	}
	public static void main(String[] args) 
	{
		System.out.println("************** Prigram Starts **********");
		display();
		print('d');
		call(123456);
		
		System.out.println("************** Passing Parameters using variables **********");
		int x=789;
		char cd='a';
		ExampleStatic.display();
		ExampleStatic.print(cd);
		ExampleStatic.call(x);
		System.out.println("************** Prigram Ends **********");

	}

}
