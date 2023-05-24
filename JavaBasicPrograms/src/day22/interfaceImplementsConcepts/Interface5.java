package day22.interfaceImplementsConcepts;
interface Printable2
{
	void print();
}
interface Showable2 extends Printable2
{
	void show();
}
public class Interface5 implements Showable2 
{
	public void print()
	{
		System.out.println("hello i am print...");
	}
	public void show()
	{
		System.out.println("hello i am show");
	}	
	public static void main(String[] args) 
	{
		Interface5 obj=new Interface5();
		obj.print();
		obj.show();
		Printable2 p=new Interface5();
		p.print();
	}

}
