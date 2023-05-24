package day13.methodexamples;
// when we dont want to return any value to JVM that time we use void return type
public class VoidExample 
{
	static void display()
	{
		System.out.println("In display().");
	}
	static void print(char ch)
	{
		System.out.println("In print() and printing character : "+ch);
	}
	static void call(int num)
	{
		System.out.println("In call() and calling number : "+num);
	}
	public static void main(String[] args) 
	{
		System.out.println("Program starts.....................");
		display();
		System.out.println("***********************1************************\n");
		
		print('A');
		System.out.println("***********************1************************\n");

		call(53);
		System.out.println("***********************1************************\n");
		
	}

}
