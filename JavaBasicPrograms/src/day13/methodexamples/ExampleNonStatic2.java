package day13.methodexamples;

public class ExampleNonStatic2 {
	void display() {
		System.out.println("I am display method");
	}
	
	static void print(char c1) {
		System.out.println("I am print method and printing char as: "+c1);
	}
	
	private void call(long num) 
	{
		System.out.println("I am call method and calling number is: "+num);
	}

	public static void main(String[] args) 
	{
		ExampleNonStatic2 e=new ExampleNonStatic2();
		e.display();
		
		print('c');
		
		e.call(456);

	}

}
