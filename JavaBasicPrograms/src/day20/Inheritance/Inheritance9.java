package day20.Inheritance;

class company101
{
	void display()
	{
		System.out.println("I am company class display()...");
	}
}
class employee101 extends company101
{
	@Override
	void display()
	{
		super.display();
		System.out.println("I am employee class display()");
	}
	void callme()
	{
		System.out.println("Employee class callme()..");
	}
}
public class Inheritance9 {

	public static void main(String[] args) 
	{
		employee101 e=new employee101();
		e.display();
		e.callme();
	}

}
